package com.atguigu.CollectionsFramework.Set;

import com.atguigu.CollectionsFramework.Person;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author:asher
 * @Date:2020/8/27 17:47
 * @Description:com.atguigu.CollectionsFramework.Set
 * @Version:1.0
 */
public class TreeSetTest {
    @Test
    public void test() {
        TreeSet treeSet = new TreeSet<>();
        //1 TreeSet中，不能存放不同类的对象。其中，可以添加的元素必须是同一个类的对象。
        //因为，TreeSet自身可以根据元素的某一属性进行排序。
//        treeSet.add(1);
//        treeSet.add("aa");
//        treeSet.add(new Person("tom", 12));
        //2排序
//        treeSet.add(9);
//        treeSet.add(-34);
//        treeSet.add(1999);
//        treeSet.add(77);
//        treeSet.add(9);
        treeSet.add(new User("Alen", 12));
        treeSet.add(new User("Bobo", 22));
        treeSet.add(new User("Jim", 28));
        treeSet.add(new User("Jim", 19));
        System.out.println(treeSet.size());
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Comparator comparator= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else throw new RuntimeException();
            }
        };

        TreeSet treeSet = new TreeSet<>(comparator);
        treeSet.add(new User("Alen", 12));
        treeSet.add(new User("Bobo", 22));
        treeSet.add(new User("Jim", 28));
        treeSet.add(new User("Jim", 19));
        System.out.println(treeSet.size());
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
