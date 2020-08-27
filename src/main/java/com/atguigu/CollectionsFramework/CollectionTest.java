package com.atguigu.CollectionsFramework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/18 16:15
 * @Description:com.atguigu.CollectionsFramework
 * @Version:1.0
 */
public class CollectionTest {
    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        collection1.add(456);
        collection1.add("cc");
        collection.addAll(collection1);
        System.out.println(collection.contains("aa"));
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.add(new String("hello"));
        collection.add(new Person("Jerry", 20));
        System.out.println(collection.contains(new String("hello")));
        System.out.println(collection.size());
        System.out.println(collection.contains(new Person("Jerry", 20)));
        System.out.println("=====================");

        System.out.println(collection);
        System.out.println(collection1);
        Collection collection2 = Arrays.asList(456, 12345);
        System.out.println(collection1.equals(collection2));
        System.out.println(collection1.contains(collection2));
        System.out.println(collection1.containsAll(collection2));
        System.out.println(collection.toArray().toString());
        System.out.println(collection1.toArray().toString());
        System.out.println(collection2.toArray().toString());

        List<Integer> ints = Arrays.asList(1,2,3);
        System.out.println(ints);
        List arr1 = Arrays.asList(new int[]{1, 2});
        System.out.println(arr1);
        System.out.println(arr1.size());
        Object[] array;
        List arr2 = Arrays.asList(new Integer[]{1, 2});
        System.out.println(arr2);
        System.out.println(arr2.size());
    }
}
