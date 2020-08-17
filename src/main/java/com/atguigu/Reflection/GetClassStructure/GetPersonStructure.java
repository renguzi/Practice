package com.atguigu.Reflection.GetClassStructure;

import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author:asher
 * @Date:2020/8/17 10:18
 * @Description:com.atguigu.Reflection.GetClassStructure
 * @Version:1.0
 */
public class GetPersonStructure {
    /**
     * 获取Person类的父类
     */
    @Test
    public void test() {
        Class clazz = Person.class;
        Class superClass = clazz.getSuperclass();
        System.out.println(superClass.getName());
    }

    /**
     * 获取运行时类的带泛型的父类
     */
    @Test
    public void test1() {
        Class clazz = Person.class;
        System.out.println(clazz.getGenericSuperclass().getTypeName());
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType)genericSuperclass;
        System.out.println(parameterizedType.getRawType());
        System.out.println(parameterizedType.getOwnerType());
        System.out.println(parameterizedType.getTypeName());
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (Type t: actualTypeArguments ) {
            System.out.println(t.getTypeName());

        }
    }
}
