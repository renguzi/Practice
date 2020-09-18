package com.atguigu.StringAndUtilClasses;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/16 11:16
 * @Description:com.atguigu.StringAndUtilClasses
 * @Version:1.0
 */
public class IDEADebugTest {
    @Test
    public void test() {
        String s = null;
        StringBuffer sb = new StringBuffer();
        sb.append(s);

        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(s);
        System.out.println(sb1);
    }
}
