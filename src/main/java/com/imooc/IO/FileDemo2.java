package com.imooc.IO;

/**
 * @Author:asher
 * @Date:2020/8/4 16:21
 * @Description:com.imooc.IO
 * @Version:1.0
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 标准流程声明和finally释放资源
 * 1确定数据源；
 * 2选择IO流；
 * 3操作（读、写）
 * 4释放资源
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("/Users/asher/imooc/bos.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int temp;
            while ((temp = fileInputStream.read()) != -1) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileInputStream) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
