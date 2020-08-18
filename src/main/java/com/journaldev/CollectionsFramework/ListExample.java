package com.journaldev.CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/18 11:21
 * @Description:com.journaldev.CollectionsFramework
 * @Version:1.0
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        List<String> list = new ArrayList<>();
        list.add("O");
        list.add("U");
        vowels.addAll(list);
        System.out.println(vowels);

        //clear example to clear the list
        list.clear();
        //size example
        System.out.println("letters list size=" + vowels.size());
        System.out.println("list size=" + list.size());
        //set example
        vowels.set(2, "E");
        System.out.println(vowels);
        //sublist example
        vowels.clear();
        vowels.add("E");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        list = vowels.subList(0, 2);
        System.out.println("letters= " + vowels + ", list = " + list);
        vowels.set(0, "A");
        System.out.println("letters= " + vowels + ", list = " + list);
        list.add("U");
        System.out.println("letters= " + vowels + ", list = " + list);
    }
}
