package com.atguigu;


import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/5 15:47
 * @Description:com.atguigu
 * @Version:1.0
 */
public class GenericTest {
    @Test
    public void test1() {
       ArrayList list = new ArrayList();
        list.add(101);
        list.add(102);
        list.add("Tom");
        for (Object al: list ) {
            int score = (int) al;
            System.out.println(score);
        }
    }

    @Test
    public void test2() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(102);
//        arrayList.add("Jack");
        arrayList.add(100);
        for (Integer i: arrayList ) {
            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("tom", 100);
        map.put("jack", 80);
        map.put("jerry", 99);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key ::" + key + " value:: " + value);
        }
    }
}
