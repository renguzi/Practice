package com.atguigu.Reflection;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2020/8/15 17:27
 * @Description:com.atguigu.Reflection
 * @Version:1.0
 */
public class RuntimeClassInstance {
    @Test
    public void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
//        Method method = clazz.getDeclaredMethod("Person");
//        method.setAccessible(true);
//        Person jjj = (Person) method.invoke(new Person("jjj", 1));
//        System.out.println(jjj);
        System.out.println("99999999999999999");

        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor();
        System.out.println(declaredConstructor.newInstance());
        System.out.println("=========");
        Person person = clazz.newInstance();
        System.out.println(person);
    }

    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        for (int i = 0; i < 10; i++) {
            int n = new Random().nextInt(3);
            String FilePath = null;
            switch (n) {
                case 0:
                    FilePath = "java.util.Date";
                    break;
                case 1:
                    FilePath = "java.lang.Object";
                    break;
                case 2:
                    FilePath = "com.atguigu.Reflection.Person";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + n);
            }
//            ClassLoader classLoader = RuntimeClassInstance.class.getClassLoader();
//            System.out.println(classLoader.loadClass(FilePath).newInstance().toString());
            Class clazz = Class.forName(FilePath);
            System.out.println(clazz.newInstance().toString());
        }
    }
}
