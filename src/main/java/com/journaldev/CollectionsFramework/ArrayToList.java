package com.journaldev.CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/18 09:18
 * @Description:com.journaldev.CollectionsFramework
 * @Version:1.0
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        List<String> vowelsList = Arrays.asList(vowels);
//        java.lang.UnsupportedOperationException
//        为什么用Arrays工具类的asList()方法，生成的List，不能对其进行结构性修改呢？
//        vowelsList.add("h");
//        vowelsList.remove("a");
        System.out.println(vowelsList.contains("i"));
        for (String s:vowelsList ) {
            System.out.println(s);
        }
        List<String> vl = new ArrayList<>();
        for (String s : vowels) {
            vl.add(s);
        }
        vl.add("a");
        System.out.println(vl.toString());
        System.out.println(vl);
        List<String> vl2 = new ArrayList<>();
        vl2.addAll(Arrays.asList(vowels));
        vl2.add("hello");
        System.out.println(vl2);

    }
}
