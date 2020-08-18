package com.journaldev.CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/18 09:48
 * @Description:com.journaldev.CollectionsFramework
 * @Version:1.0
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("e");
        String[] stringArray = new String[stringList.size()];
        //方式1；
//        for (int i = 0; i < stringList.size(); i++) {
//            stringArray[i] = stringList.get(i);
//        }
        //方式2：用List的toArray()方法。
        stringArray = (String[]) stringList.toArray();
        System.out.println(Arrays.toString(stringArray));
    }
}
