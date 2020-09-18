package com.journaldev.CollectionsFramework;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/18 10:02
 * @Description:com.journaldev.CollectionsFramework
 * @Version:1.0
 */
public class ListSortExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        list.add(random.nextInt(1000));
        }
        System.out.println("original list:");
        System.out.println(list);
        System.out.println("after sort by Collections.sort(list)");
        Collections.sort(list);
        System.out.println(list);

        list.sort(((o1, o2) -> {
            return o2 - o1;}));
        System.out.println("Reverse sorting:");
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        System.out.println("---------------------");
        System.out.println(list);

    }
}
