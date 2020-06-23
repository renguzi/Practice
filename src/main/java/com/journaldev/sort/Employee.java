package com.journaldev.sort;

import java.util.Comparator;

/**
 * @Author:asher
 * @Date:2020/6/8 17:05
 * @Description:com.journaldev.sort
 * @Version:1.0
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee o) {
//        if (this.name.compareToIgnoreCase(o.name) < 0) {
//            return -1;
//        }
//        if (this.name.compareToIgnoreCase(o.name) > 0) {
//            return 1;
//        }
//        return 0;
        return this.name.compareToIgnoreCase(o.name);
//        return this.name - o.name;
    }

    //
//    public int compareTo(Employee o) {
//        if (this.id < o.id) {
//            return -1;
//        }
//        if (this.id > o.id) {
//            return 1;
//        }
//        return 0;
//    }
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().length() - o2.getName().length();
        }
    };

    public static Comparator<Employee> SalaryComparator=new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    };

   public static Comparator<Employee> NameAndSalaryComparator=new Comparator<Employee>() {
       @Override
       public int compare(Employee o1, Employee o2) {
           int flag = o1.getName().length() - o2.getName().length();
           if (flag == 0) {
               return (int) (o2.getSalary() - o2.getSalary());
           }
           return flag;
       }
   };
}
