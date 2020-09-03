package com.atguigu.CollectionsFramework.Map;

import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;
import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

/**
 * @Author:asher
 * @Date:2020/9/1 09:25
 * @Description:com.atguigu.CollectionsFramework.Map
 * @Version:1.0
 */
public class TreeMapTest {
    @Test
    public void test() {
        User u1 = new User(12, "Tom");
        User u2 = new User(12, "Kate");
        User u3 = new User(20, "Jerry");
        User u4 = new User(18, "Christina");
        TreeMap treeMap = new TreeMap<>();
        treeMap.put(u1, 66);
        treeMap.put(u2, 79);
        treeMap.put(u3, 55);
        treeMap.put(u4, 87);
        Set entrySet = treeMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Map.Entry<User, Integer> mapEntry = (Map.Entry<User, Integer>) next;
            System.out.println(mapEntry.getKey() + "  " + mapEntry.getValue());
        }
    }

    @Test
    public void test1() {
        User u1 = new User(12, "Tom");
        User u2 = new User(12, "Kate");
        User u3 = new User(20, "Jerry");
        User u4 = new User(18, "Christina");
        TreeMap treeMap=new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int flag = o1.getAge()-o2.getAge();
                if (flag == 0) {
                    flag = o2.getName().compareTo(o1.getName());
                }
                return flag;
            }
        });
        treeMap.put(u1, 38);
        treeMap.put(u2, 30);
        treeMap.put(u3, 45);
        treeMap.put(u4, 19);
        Set ks = treeMap.keySet();
//        Set keySet = treeMap.keySet();
        Iterator<User> iterator = ks.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            int userAge = user.getAge();
            String userName = user.getName();
            Object o = treeMap.get(user);
            System.out.println("Key:    userAge: " + userAge + "  userName: " + userName + " Value:" + o);
        }
    }
}
