package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @Author:asher
 * @Date:2020/9/20 11:35
 * @Description:com.leetcode
 * @Version:1.0
 */
public class MaxWater {
    public static void main(String[] args) {
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3,7};
        int s = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] <= a[j]) {
                    s = a[i] * (j - i);
                } else {
                    s = a[j] * (j - i);
                }
                arrayList.add(s);
//                System.out.println(s);
            }
        }
        Collections.sort(arrayList);
        System.out.println("手工结果");
        System.out.println(arrayList.get(arrayList.size()-1));

        //
        System.out.println("方法结果。");
        System.out.println(maxArea(a));

        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        for (int k : array) {
            System.out.print(k+"  ");

        }
        System.out.println(maxArea(array));

    }



    public static int maxArea(int[] a) {
        int max=0;
        if (a[0] < a[1]) {
            max = a[0];
        } else {
            max = a[1];
        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.set(0, max);
//        arrayList.add(max);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tempMax = 0;
                if (a[i] <= a[j]) {
//                    if (a[i]*(j-i)<=max)
//                        arrayList.set(0, max);
//                    arrayList.set(0, a[i] * (j - i));
//                    arrayList.add(a[i] * (j - i));
                    tempMax = a[i] * (j - i);
                } else {
                    tempMax = a[j] * (j - i);
//                    arrayList.set(0, a[j] * (j - i));
//                    arrayList.add(a[j] * (j - i));
                }
                if (tempMax > max) {
                    max = tempMax;
                }

//                if (max > arrayList.get(0)) {
//                    arrayList.set(0, max);
//                }
            }
        }
//        int max = 0;
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            int temp=iterator.next();
//            if (temp > max) {
//                max=temp;
//            }
//        }
//        return arrayList.get(0);
        return max;
//        Collections.sort(arrayList);
//        return arrayList.get(arrayList.size()-1);
    }

}
