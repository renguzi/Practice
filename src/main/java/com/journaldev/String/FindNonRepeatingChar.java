package com.journaldev.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/9/24 16:47
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class FindNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(printFirstNonRepeatingChar("abcaabcdexy"));
        System.out.println(printFirstNonRepeatingChar("abca"));
        System.out.println(printFirstNonRepeatingChar("aaa"));

    }

    private static Character printFirstNonRepeatingChar(String string) {
        char[] chars = string.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (list.contains(c)) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (c == chars[j]) {
                    list.add(c);
                    break;
                } else if (j == chars.length - 1) {
                    return c;
                }
            }
        }
        return null;
    }
}
