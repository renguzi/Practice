package com.atguigu.StringAndUtilClasses.StringBufferBuilder;

/**
 * @Author:asher
 * @Date:2020/9/15 14:57
 * @Description:com.atguigu.StringAndUtilClasses.StringBufferBuilder
 * @Version:1.0
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        String s1 = "hello";
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuilder stringBuilder = new StringBuilder("hello");
        s1.replace("h", "H");
        stringBuffer.replace(0, 1, "H");
        stringBuilder.replace(0, 1, "H");
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        //char[] value = new char[0];
        String s2 = new String();
        System.out.println("s2 length:"+ s2.length());

        //char[] value = {"a","b","c"};
        String s3 = new String("abc");
        System.out.println("s3 length:"+ s3.length());

        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 length:" + sb1.length());
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2 length:" + sb2.length());
        sb2.append("c");
        System.out.println(sb2.toString());
        for (int i = 0; i < sb2.length(); i++) {
            System.out.print(sb2.charAt(i) + " ");
        }

    }
}
