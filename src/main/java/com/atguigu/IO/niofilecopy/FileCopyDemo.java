package com.atguigu.IO.niofilecopy;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

/**
 * @Author:asher
 * @Date:2020/11/25 16:21
 * @Description:com.atguigu.IO.niofilecopy
 * @Version:1.0
 */
interface FileCopyRunner {
    void copyFile(File source, File target);

}

public class FileCopyDemo {
    private static final int ROUNDS=5;
    private static void benchmark(FileCopyRunner test, File source, File target) {
        long elapsed = 0L;
        for (int i = 0; i < ROUNDS; i++) {
            long startTime = System.currentTimeMillis();
            test.copyFile(source, target);
            elapsed += System.currentTimeMillis() - startTime;
            target.delete();
        }
        System.out.println(test + ":" + elapsed / 5);
    }



    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        FileCopyRunner noBufferStreamCopy= new FileCopyRunner() {
            @Override
            public void copyFile(File source, File target) {
                InputStream fin = null;
                OutputStream fout = null;
                try {
                    fin = new FileInputStream(source);
                    fout = new FileOutputStream(target);
                    int n=0;
                    while ((n = fin.read()) != -1) {
                        fout.write(n);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    close(fin);
                    close(fout);
                }
            }

            @Override
            public String toString() {
                return "noBufferStreamCopy";
            }
        };



        FileCopyRunner bufferStreamCopy= new FileCopyRunner() {
            @Override
            public void copyFile(File source, File target) {
                InputStream fis = null;
                OutputStream fout = null;
                try {
                    fis = new BufferedInputStream(new FileInputStream(source));
                    fout = new BufferedOutputStream(new FileOutputStream(target));
                    byte[] bytes = new byte[1024];
                    int length = 0;
                    while ((length = fis.read(bytes)) != -1) {
                        fout.write(bytes, 0, length);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    close(fis);
                    close(fout);
                }
            }

            @Override
            public String toString() {
                return "bufferStreamCopy";
            }
        };
        FileCopyRunner nioBufferCopy= new FileCopyRunner() {
            @Override
            public void copyFile(File source, File target) {
                FileChannel fin = null;
                FileChannel fout = null;
                try {
                    fin = new FileInputStream(source).getChannel();
                    fout = new FileOutputStream(target).getChannel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    while ( fin.read(byteBuffer) != -1) {
                            byteBuffer.flip();
                        while (byteBuffer.hasRemaining()) {
                            fout.write(byteBuffer);
                        }
                        byteBuffer.clear();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    close(fin);
                    close(fout);
                }
            }

            @Override
            public String toString() {
                return "nioBufferCopy";
            }
        };
        FileCopyRunner nioTransferCopy= new FileCopyRunner() {
            @Override
            public void copyFile(File source, File target) {
                FileChannel fin = null;
                FileChannel fout = null;
                try {
                    fin=new FileInputStream(source).getChannel();
                    fout = new FileOutputStream(target).getChannel();
                    long transferred = 0L;
                    while (transferred != fin.size()) {
                        transferred += fin.transferTo(0, fin.size(), fout);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    close(fin);
                    close(fout);
                }
            }

            @Override
            public String toString() {
                return "nioTransferCopy";
            }
        };
        System.out.println("small file copy test.....");
        File smallSource = new File("/Users/asher/get-pip.py");
        File smallTarget = new File("/Users/asher/get-pip.py.cp");
        benchmark(noBufferStreamCopy, smallSource, smallTarget);
        benchmark(bufferStreamCopy, smallSource, smallTarget);
        benchmark(nioBufferCopy, smallSource, smallTarget);
        benchmark(nioTransferCopy, smallSource, smallTarget);

        System.out.println("medium file copy test.....");
        File mediumSource = new File("/Users/asher/spring-boot-cli-1.5.9.RELEASE-bin.zip");
        File mediumTarget = new File("/Users/asher/spring-boot-cli-1.5.9.RELEASE-bin.zip.cp");
        benchmark(noBufferStreamCopy, mediumSource, mediumTarget);
        benchmark(bufferStreamCopy, mediumSource, mediumTarget);
        benchmark(nioBufferCopy, mediumSource, mediumTarget);
        benchmark(nioTransferCopy, mediumSource, mediumTarget);
    }


}
