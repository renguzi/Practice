package com.journaldev.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/19 07:47
 * @Description:com.journaldev.CollectionsFramework.ArrayList
 * @Version:1.0
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();
        List<String> dictionaryWordsList = new ArrayList<>(5000);
        vowels.add("A");
        vowels.add("B");
        vowels.add("C");
        vowels.add("D");
        vowels.add("E");
        List<String> myList = new ArrayList<>(dictionaryWordsList);
        System.out.println(myList.size());
        System.out.println(vowels.size());

        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("C");
        letters.add("D");
        //Lets insert B between A and C
        letters.add(1, "B");
        System.out.println(letters);

        List<String> list = new ArrayList<String>();
        list.add("E");
        list.add("H");
        //appending list elements to letters
        letters.addAll(list);
        System.out.println(letters);
        //clear list to empty list
        list.clear();
        list.add("F");
        list.add("G");
        //inserting list inside letters to get right sequence
        letters.addAll(5, list);
        System.out.println(letters);

    }
}
