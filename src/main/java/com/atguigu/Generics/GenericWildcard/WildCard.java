package com.atguigu.Generics.GenericWildcard;

import org.junit.jupiter.api.Test;

import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/7 11:02
 * @Description:com.atguigu.Generics.GenericWildcard
 * @Version:1.0
 */
public class WildCard {
    @Test
    public void test1() {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
//        list1 = list2;
        List<?> list3 = new ArrayList<>();
        list3 = list1;
        list3 = list2;

//        list3.add("zz");

        list1.add(1);
        list1.add("a");

        list2.add("hello");
        list2.add("java");
//        print(list1);
//        print(list2);
//        print(list3);

        print2(list1);
        print2(list2);
        print2(list3);

        Object o = list3.get(0);

        System.out.println(o);
    }

    public List<?> print(List<?> list) {
        return list;
    }

    public void print2(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }

    @Test
    public void test2() {
        List<? extends Person> list1 = new ArrayList<>();
        List<? super Student> list2 = new ArrayList<>();
        List<Person> list3 = new ArrayList<>();
        List<Student> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();
//        list1.add(new Person());

       list1 = list3;
       list1 = list4;
//       list1 = list5;
        list2 = list3;
        list2 = list4;
        list2 = list5;
        Person person = list1.get(0);
//        Student student = list1.get(0);
//        list1.add(new Person());
//        list1.add(new Student());
        list2.add(new Student());


        Object object = list2.get(0);
//        Student student = list2.get(1);
//        Person person1 = list2.get(1);
//        list2.add(new Person());
//        list2.add(new Object());
    }
}
