package com.atguigu.Generics.exer;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/8 17:04
 * @Description:com.atguigu.Generics.exer
 * @Version:1.0
 */
public class ListIterator {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("h");
        list.add("e");
        list.add("l");
        for (String s: list ) {
            System.out.println(s);
        }
        System.out.println(" ----------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "你好");
        map.put("Earn", "赚钱");
        map.put("Better", "更好");
        List<String> list = new ArrayList<>();
        Collection<String> values = map.values();
        for (String s: values ) {
            list.add(s);
        }
        System.out.println(list);
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> next = entryIterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println("key: " + key + " value: " + value);
        }
    }
}
