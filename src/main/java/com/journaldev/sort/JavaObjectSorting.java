package com.journaldev.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/6/8 16:57
 * @Description:com.journaldev.sort
 * @Version:1.0
 */
public class JavaObjectSorting {
    public static void main(String[] args) {
        int[] intArr = {5, 9, 1, 10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = {"A", "C", "Z", "B", "E"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        List<String> stringList = new ArrayList<String>();
        stringList.add("T");
        stringList.add("A");
        stringList.add("B");
        stringList.add("L");
        stringList.add("E");
        System.out.println("Before ordering....");
        for (String s :
                stringList) {
            System.out.println(s);
        }
        Collections.sort(stringList);
        for (String s :
                stringList) {
            System.out.println(s);
        }
        Employee[] employees = new Employee[4];
        employees[0] = new Employee(10, "Mikery", 25, 10000);
        employees[1] = new Employee(20, "Arun", 28, 25000);
        employees[2] = new Employee(5, "Lisa", 22, 5000);
        employees[3] = new Employee(1, "Pankaj", 32, 50000);
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        System.out.println("order by name length.");
        Arrays.sort(employees, Employee.NameComparator);
        System.out.println(Arrays.toString(employees));

        System.out.println("order by salary.");
        Arrays.sort(employees, Employee.SalaryComparator);
        System.out.println(Arrays.toString(employees));

        System.out.println("order by name length and salary.");
        Arrays.sort(employees, Employee.NameAndSalaryComparator);
        System.out.println(Arrays.toString(employees));
        System.out.println(employees.getClass().getName());
        System.out.println(employees[0].getClass().getName());
        Class cl = employees.getClass();
        Class c2 = employees[1].getClass();
        System.out.println(cl);
        System.out.println(cl.getName());
        System.out.println(c2.getName());
    }
}
