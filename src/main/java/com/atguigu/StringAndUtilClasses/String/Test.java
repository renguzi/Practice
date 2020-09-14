package com.atguigu.StringAndUtilClasses.String;

/**
 * @Author:asher
 * @Date:2020/9/14 11:28
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class Test {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String s, char[] chars) {
        s = "better";
        chars[0] = 'b';
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.change(t1.str, t1.ch);
        System.out.println(t1.str);
        System.out.println(t1.ch);
    }
}
