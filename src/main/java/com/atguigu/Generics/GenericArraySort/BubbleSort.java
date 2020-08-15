package com.atguigu.Generics.GenericArraySort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/8/14 16:46
 * @Description:com.atguigu.Generics.GenericArraySort
 * @Version:1.0
 */
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }




    @Test
    public void test() {
        int[] ints = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
