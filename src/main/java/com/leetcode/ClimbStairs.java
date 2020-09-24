package com.leetcode;

import java.util.Hashtable;

/**
 * @Author:asher
 * @Date:2020/9/22 14:17
 * @Description:com.leetcode
 * @Version:1.0
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
//        System.out.println(climbStairs(45));
//        System.out.println(climb2(45));
        System.out.println(climb2(45));
    }

    public static int climbStairs(int n) {
        int sum=0;
        if (n < 1) {
            sum = 0;
            return 0;
        }
        if (n == 1) {
            sum = 1;
            return sum;
        }
        if (n == 2) {
            sum = 2;
            return sum;
        }
        sum = climbStairs(n - 1) + climbStairs(n - 2);
        return sum;
    }

    public static int climb2(int n) {
        Hashtable<Integer, Integer> hasResolved = new Hashtable<>();
        if (n == 1) {
            hasResolved.put(1, 1);
            return 1;
        }
        if (n == 2) {
            hasResolved.put(2, 2);
            return 2;
        }

        if (hasResolved.containsKey(n)) {
            return hasResolved.get(n);
        }

        int sum = climb2(n - 1) + climb2(n - 2);
        hasResolved.put(n, sum);
        System.out.println(hasResolved);
        return sum;
    }
}
