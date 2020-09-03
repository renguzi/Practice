package com.atguigu.CollectionsFramework.Set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author:asher
 * @Date:2020/8/27 10:03
 * @Description:com.atguigu.CollectionsFramework.Set
 * @Version:1.0
 */
public class SetTest {
    @Test
    public void test() {
        Set set = new HashSet<>();
        set.add(123);
        set.add(null);
        set.add("AA");
        set.add(null);
        set.add(new User("tom", 12));
        set.add(new User("tom", 12));
        set.add(456);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
