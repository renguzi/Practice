package com.journaldev.String;

import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2020/9/24 15:37
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class CheckStringContainsAnother {
    public static void main(String[] args) {
        System.out.println("请输入第一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println("请输入第2个字符串：");
        String s2 = scanner.nextLine();
        scanner.close();
        System.out.println("1 包含 2： " + containsAnother(s1, s2));
    }

    public static boolean containsAnother(String s1, String s2) {
        return s1.contains(s2);
    }
}
