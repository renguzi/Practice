package com.journaldev.String;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/9/23 15:08
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class CharacterCount {
    public static void main(String[] args) {
        String s = "HelloWorld.";
        char[] chars = s.toCharArray();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
//            else {
//                map.put(String.valueOf(chars[i]), (map.get(String.valueOf(chars[i])))++);
//            }
//            map.
//            if (map.containsKey(chars[i])) {
//                map.put(String.valueOf(chars[i]), map.get(String.valueOf(chars[i])) );
//            }
//            if (!map.containsKey(chars[i])) {
//                map.put(String.valueOf(chars[i]), 1);
//            }
            map.merge(String.valueOf(chars[i]), 1, Integer::sum);

        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
            System.out.println("字符："+key+" 出现次数： "+map.get(key));
//            System.out.println(map.get(key));
        }
        System.out.println("===========================");
        Iterator<String> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            int count = map.get(key);
            System.out.println("字符 " + key + "  次数" + count);
        }

    }
}
