package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/24 15:19
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        countNumberOfWords("My Name is Huangwei");
        countNumberOfWords("I am learning java");
        countNumberOfWords("  This is not properly formatted              line      ");
        countNumberOfWords("");
    }

    public static void countNumberOfWords(String line) {
        String trimmedLine = line.trim();
        int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;
        System.out.println(count);
    }
}
