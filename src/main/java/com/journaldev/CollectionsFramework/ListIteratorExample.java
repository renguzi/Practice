package com.journaldev.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/18 14:58
 * @Description:com.journaldev.CollectionsFramework
 * @Version:1.0
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + "  ");
        }
        System.out.println("\n" + list);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            if (x%2==0) iterator.remove();
        }
        System.out.println(list);

        iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i == 1) {
                list.add(101);
            }
        }
    }

}
