package com.atguigu.Reflection;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author:asher
 * @Date:2020/8/15 11:27
 * @Description:com.atguigu.Reflection
 * @Version:1.0
 */
public class ClassLoaderTest {
    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("com.atguigu.Reflection.ClassLoaderTest");
        System.out.println(aClass.getName());
        System.out.println(classLoader.loadClass("com.atguigu.Reflection.ClassLoaderTest").getName());
        System.out.println(classLoader.loadClass("com.atguigu.Reflection.ClassLoaderTest").newInstance().getClass());
        System.out.println(classLoader);

        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader().getParent();
        System.out.println(classLoader1);

        System.out.println("----------------");
        System.out.println(Person.class.getClassLoader());
        System.out.println(Person.class.getClassLoader().getParent());
        System.out.println(Person.class.getClassLoader().getParent().getParent());

        System.out.println("================");
        System.out.println(String.class.getClassLoader());
        System.out.println(String.class.getClassLoader().getParent());

    }

    @Test
    public void test1() throws IOException {
        Properties properties = new Properties();
        File file = new File("/Users/asher/imooc/properties.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        String user = properties.getProperty("user");

        String password = properties.getProperty("password");
        System.out.println("user: " + user + " password: " + password);

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("properties.txt");
        properties.load(resourceAsStream);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
