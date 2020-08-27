package com.atguigu.CollectionsFramework.ListSourceCode;

import com.atguigu.CollectionsFramework.Person;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/25 10:39
 * @Description:com.atguigu.CollectionsFramework.ListSourceCode
 * @Version:1.0
 */
public class ArrayListSourceCode {
    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("tom", 12));
        list.add(456);
        System.out.println(list);
        list.add(1, "BB");
        System.out.println(list);
        //addAll(int index,Collection cols)
        list.addAll(4, Arrays.asList(1, 2, 3));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(4567));
        System.out.println(list.lastIndexOf(456));
        System.out.println(list.remove(2));
        System.out.println(list.set(1, "CCCC"));
        System.out.println(list);
        System.out.println(list.subList(1, 4));
        List list1 = list.subList(1, 4);
        System.out.println(list1);
        list1.add(9999);
        System.out.println(list);
        System.out.println(list1);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===========");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("======================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
