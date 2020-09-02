package com.atguigu.Generics.GenericMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @Author:asher
 * @Date:2020/9/2 16:50
 * @Description:com.atguigu.Generics.GenericMethod
 * @Version:1.0
 */
public class NormalClass {
    private int id;

    public NormalClass() {
    }

    public NormalClass(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NormalClass{" +
                "id=" + id +
                '}';
    }

    public <E> List<E> getListFromArray(E[] e) {
        List<E> list = new ArrayList<E>();
        for (E ele:e ) {
            list.add(ele);
        }
        return list;
    }

    public static void main(String[] args) {
        NormalClass normalClass = new NormalClass();
        String[] strings = new String[]{"java", "hello", "Oracle"};
        List<String> stringList = normalClass.getListFromArray(strings);
        System.out.println(stringList);
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        NormalClass[] normalClasses = new NormalClass[]{new NormalClass(11), null, normalClass, new NormalClass(100)};
        List<NormalClass> normalClassList = normalClass.getListFromArray(normalClasses);
        System.out.println(normalClassList);
    }
}
