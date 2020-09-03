package com.atguigu.CollectionsFramework.exer;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/31 09:24
 * @Description:com.atguigu.CollectionsFramework.exer
 * @Version:1.0
 */
public class EmployeeTest {
    @Test
    public void test() {
        TreeSet treeSet = new TreeSet<>();
        treeSet.add(new Employee("liudehua", new MyDate(1965, 4, 3), 22));
        treeSet.add(new Employee("zhangxueyou", new MyDate(1974, 12, 23), 33));
        treeSet.add(new Employee("guofucheng", new MyDate(1980, 1, 23), 39));
        treeSet.add(new Employee("liming", new MyDate(1978, 10, 12), 41));
        treeSet.add(new Employee("zhouxingchi", new MyDate(1969, 12, 28), 50));

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Comparator comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int flag = o1.getName().compareTo(o2.getName());
                if (flag == 0) {
                    flag = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                }
                return flag;
            }
        };

        TreeSet treeSet = new TreeSet<>(comparator);
        treeSet.add(new Employee("liudehua", new MyDate(1965, 4, 3), 22));
        treeSet.add(new Employee("liming", new MyDate(1974, 12, 23), 33));
        treeSet.add(new Employee("guofucheng", new MyDate(1980, 1, 23), 39));
        treeSet.add(new Employee("liming", new MyDate(1978, 10, 12), 41));
        treeSet.add(new Employee("guofucheng", new MyDate(1969, 12, 28), 50));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashMap map =new HashMap();

    }
}
