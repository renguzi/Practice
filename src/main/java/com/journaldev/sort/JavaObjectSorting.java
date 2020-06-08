package com.journaldev.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/6/8 16:57
 * @Description:com.journaldev.sort
 * @Version:1.0
 */
public class JavaObjectSorting {
    public static void main(String[] args) {
        int[] intArr = {5, 9, 1, 10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = {"A", "C", "Z", "B", "E"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        List<String> stringList = new ArrayList<String>();
        stringList.add("T");
        stringList.add("A");
        stringList.add("B");
        stringList.add("L");
        stringList.add("E");
        System.out.println("Before ordering....");
        for (String s :
                stringList) {
            System.out.println(s);
        }
        Collections.sort(stringList);
        for (String s :
                stringList) {
            System.out.println(s);
        }
    }

}
