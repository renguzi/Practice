package com.atguigu.CollectionsFramework.Map;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/31 16:28
 * @Description:com.atguigu.CollectionsFramework.Map
 * @Version:1.0
 */
public class MapTest {
    @Test
    public void test() {
        //HashMap或者其子类，LinkedHashMap都可以放NULL，但是key里只能有一个NULL，因为这是Map自身的
        //性质决定的。key不可以重复。
        //HashMap的子类，LinkedHashMap可以保证其遍历的顺序与添加的顺序一致。
        Map map = new LinkedHashMap<>();

        //Hashtable不能存放NULL值，不管是key还是value都不能为NULL。
//        map = new Hashtable();
        map.put(null, null);
        map.put(null, 123);
        map.put(123, null);
        map.put(456, null);
        map.put(null, null);
        System.out.println(map.size());
        System.out.println(map);
    }

    @Test
    public void test1() {
        HashMap hashMap = new HashMap<String, Integer>();
        hashMap.put("cat", 100);
        hashMap.put("dog", 202);
        hashMap.put("piggy", 23);
        hashMap.put("cattle", 899);

        //遍历Hashmap中的key，
        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==================");
        //遍历HashMap中的values
        Collection collection = hashMap.values();
        for (Object obj : collection) {
            System.out.println(obj);
        }

        //遍历HashMap中的Entry
        Set entrySet = hashMap.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) o;
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
