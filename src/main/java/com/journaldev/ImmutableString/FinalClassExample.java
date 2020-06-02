package com.journaldev.ImmutableString;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author:asher
 * @Date:2020/6/2 09:12
 * @Description:com.journaldev.ImmutableString
 * @Version:1.0
 */
public final class FinalClassExample {
    private final int id;
    private final String name;
    private final HashMap<String,String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
//        return testMap;
        return (HashMap<String, String>) testMap.clone();
    }

    /**
     * Constructor performing shallow copy
     * @param id
     * @param name
     * @param testMap
     */
    public FinalClassExample(int id, String name, HashMap<String, String> testMap) {
        this.id = id;
        this.name = name;
        this.testMap = testMap;
    }

    /**
     * Constructor performing deep Copy
     * @param id
     * @param name
     * @param hashMap
     */
//    public FinalClassExample(int id, String name, HashMap<String, String> hashMap) {
//        this.id = id;
//        this.name = name;
//        HashMap<String, String> tempMap = new HashMap<String, String>();
//        Iterator iterator = hashMap.keySet().iterator();
//        String key;
//        while (iterator.hasNext()) {
//            key = (String) iterator.next();
//            tempMap.put(key, hashMap.get(key));
//        }
//        this.testMap = tempMap;
//    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "first");
        hashMap.put("2", "second");
        String s = "original";
        int id = 10;

        FinalClassExample finalClassExample = new FinalClassExample(id, s, hashMap);
        //Lets see whether its copy by field or reference
        System.out.println(s == finalClassExample.getName());
        System.out.println(id == finalClassExample.getId());
        System.out.println(hashMap == finalClassExample.getTestMap());

        System.out.println("finalClassExample id:" + finalClassExample.getId());
        System.out.println("finalClassExample name:" + finalClassExample.getName());
        System.out.println("finalClassExample testMap:" + finalClassExample.getTestMap());

        id = 20;
        s = "modified";
        hashMap.put("3", "third");
        System.out.println("After local variables changed:");
        System.out.println("finalClassExample id:" + finalClassExample.getId());
        System.out.println("finalClassExample name:" + finalClassExample.getName());
        System.out.println("finalClassExample testMap:" + finalClassExample.getTestMap());

    }
}
