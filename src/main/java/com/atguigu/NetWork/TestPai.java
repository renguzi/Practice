package com.atguigu.NetWork;

import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2020/8/12 18:32
 * @Description:com.atguigu.NetWork
 * @Version:1.0
 */
public class TestPai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正N边形的边数n:");
        int n= scanner.nextInt();
        double f = n;
        System.out.println(180/f);

        double lower = n * Math.sin(Math.toRadians(180 / f));
        System.out.println("下限为: " + lower);
        double upper = n * Math.tan(Math.toRadians(180 / f));
        System.out.println("π=     "+Math.PI);
        System.out.println("上限为: "+upper);
    }

}
