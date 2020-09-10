package com.atguigu.MultiThreads.ThreadLock;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/9/9 10:22
 * @Description:com.atguigu.MultiThreads.ThreadLock
 * @Version:1.0
 */
public class TTT {
    public static void main(String[] args) {
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("数组的随机数为：");
        for (int i: a ) {
            System.out.println(i);
        }
        for (int i = 0; i < a.length /2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println("-----Reversed Array------");
        for (int c: a ) {
            System.out.println(c);
        }

    }
}
