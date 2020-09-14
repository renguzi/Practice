package com.atguigu.StringAndUtilClasses.String;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/9/14 15:53
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class StringToByteArray {
    //字符串和字节数组之间的相互转换
    @Test
    public void test() throws UnsupportedEncodingException {
        //String--->byte[]:编码的过程，调用String类的getBytes()方法
        //该方法有个重载，默认采用UTF-8字符集编码，也可以手工指定字符集进行编码
        String s = "abc123中国";
        byte[] byteArray = s.getBytes();
        System.out.println(Arrays.toString(byteArray));

        byte[] b2 = s.getBytes("gbk");
        System.out.println(Arrays.toString(b2));

        //byte[]---->String,调用String的constructor，也有重载的形式，提供字符集
        //因为前面的byteArray是采用默认的UTF-8进行编码，所以，这里直接解码(默认也是用UTF-8)即可，并不会乱码
        String s1 = new String(byteArray);
        System.out.println(s1);

        //当我们采用指定字符集解码时，指定的字符集与编码字符集一致时就不会出现乱码，否则有可能会乱码
        System.out.println("--------gbk解码--------");
        System.out.println(new String(byteArray, "gbk"));
        System.out.println(new String(b2, "gbk"));


    }

}
