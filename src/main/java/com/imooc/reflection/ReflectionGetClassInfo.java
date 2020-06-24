package com.imooc.reflection;

/**
 * @Author:asher
 * @Date:2020/6/24 16:53
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class ReflectionGetClassInfo {
    public static void main(String[] args) {
        String s ="hello";
        ClassUtil.printClassMethod(s);
        System.out.println("对象所属类的成员变量信息");
        ClassUtil.printClassField(s);
        Word word = new Word();
        ClassUtil.printClassMethod(word);
        System.out.println("对象所属类的成员变量信息");
        ClassUtil.printClassField(word);
    }
}
