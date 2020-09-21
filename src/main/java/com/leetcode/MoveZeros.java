package com.leetcode;

/**
 * @Author:asher
 * @Date:2020/9/21 13:54
 * @Description:com.leetcode
 * @Version:1.0
 */
//将一个数组中的所有0移到最后面，其它元素位置保持不变,且要求原地排序
    //https://leetcode-cn.com/problems/move-zeroes/


public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                for (int j = i + 1; j < arr.length - i - 1; j++) {
//                    if (arr[i] != arr[j]) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//            }
//        }
        int index = 0;
        for (int num: arr ) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        for (int i: arr ) {
            System.out.println(i);
        }
    }
}
