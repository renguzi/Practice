package com.atguigu.Reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Period;

/**
 * @Author:asher
 * @Date:2020/8/14 16:18
 * @Description:com.atguigu.Reflection
 * @Version:1.0
 */
public class ReflectionTest {
    //    反射之前能做的
    @Test
    public void test() {
        Person person = new Person("Tom",12);
        person.age = 10;
        System.out.println(person.toString());
        person.show();
    }

    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        1 通过反射，创建Person类的对象
        Class clazz = Person.class;
        Class c2 = Person.class;
        System.out.println(c2.getName());
        System.out.println(c2.getPackage().getName());
        System.out.println(c2.getClass().getName());
        System.out.println(clazz == c2);
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object tom = constructor.newInstance("Tom", 12);
        System.out.println(tom.toString());
        Person person = (Person) tom;
        System.out.println(person);

//        2 通过反射，调用Person类的属性
        Field age = clazz.getDeclaredField("age");
        age.set(person, 10);
        System.out.println(person);
//        3 通过反射，调用Person的方法
        Method method = clazz.getDeclaredMethod("show");
        method.invoke(person);
//        4 通过反射，调用私有属性、构造方法、方法
        //调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "Hamks");
        System.out.println(person);
        //调用私有构造方法
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person p1 = (Person) constructor1.newInstance("Jack");
        System.out.println(p1);
        //调用私有方法
        Method m2 = clazz.getDeclaredMethod("showNation", String.class);
        m2.setAccessible(true);
        String s = (String) m2.invoke(p1, "China");
        System.out.println(s);
        System.out.println(m2.invoke(p1, "中国"));
    }
}
