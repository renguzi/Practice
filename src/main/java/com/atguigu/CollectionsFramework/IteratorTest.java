package com.atguigu.CollectionsFramework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author:asher
 * @Date:2020/8/22 17:45
 * @Description:com.atguigu.CollectionsFramework
 * @Version:1.0
 */
public class IteratorTest {
    @Test
    public void test() {

    //    Iterator
    Collection collection = new ArrayList();
        collection.add(1);
        collection.add(new Person("jack", 11));
        collection.add(new String("hello"));
        System.out.println(collection.size());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("hello")) {
                iterator.remove();
            }
//            System.out.println(collection.size());
//            iterator.next();
//            iterator.remove();
//            System.out.println(collection.size());
        }
        System.out.println(collection.size());
    }
}
