package com.imooc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author:asher
 * @Date:2020/6/24 16:35
 * @Description:com.imooc.reflection 工具类，获取类的方法、构造函数、成员变量信息
 * 传入一个对象，获取该对象所属类的信息
 * @Version:1.0
 */
public class ClassUtil {
    public static void printClassMethod(Object object) {
//   1 首先获取类名，3种方法：object.getClass();Class.forName("类的全名"); 类名.class;
        Class c = object.getClass();
        System.out.println("该对象所属类的类名：" + c.getName());
//   2 获取方法信息
        Method[] methods=object.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
//        先获取方法返回值
            System.out.print(methods[i].getReturnType().getName() +"  ");
//            获取方法名
            System.out.print(methods[i].getName()+" (");
//            获取方法参数类型,得到的是参数列表的类型的类类型
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
//            for (Class c1 : parameterTypes) {
//                System.out.print(c1.getName());
//            }
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.print(parameterTypes[j].getName());
                if (j > 0) {
                    System.out.println(",");
                }
            }
            System.out.println(")");
        }
    }

    public static void printClassField(Object object) {
        Class c = object.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
//            获取成员变量的访问修饰符
            System.out.print(Modifier.toString(fields[i].getModifiers())+"  ");
            System.out.print(fields[i].getType().getName() +"  ");
//            获取成员变量名
            System.out.println(fields[i].getName());
        }
    }
}
