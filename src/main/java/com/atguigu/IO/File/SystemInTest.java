package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import static java.lang.System.*;

/**
 * @Author:asher
 * @Date:2020/8/9 17:03
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class SystemInTest {
    /*
    从键盘读入一行字符，直到读到e或者是exit时，程序退出。否则，将读入的一行字符串转为大写字符串输出。
    利用System.in标准输入来实现。查看System源码，发现其有3个静态变量，in属性是InputStream,out和err都是PrintStream类型变量。
     */
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String data;
            while (true) {
                data = bufferedReader.readLine();
                System.out.println("输入的一行字符为：");
                System.out.println(data.toUpperCase());
                if ("e".equals(data) || "exit".equals(data)) {
                    System.out.println("程序结束");
                    break;
                }
            }

            bufferedReader.close();
        }
}
