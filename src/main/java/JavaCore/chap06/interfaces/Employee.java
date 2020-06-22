package JavaCore.chap06.interfaces;

import java.util.Comparator;

/**
 * @Author:asher
 * @Date:2020/6/22 10:36
 * @Description:JavaCore.chap06.interfaces
 * @Version:1.0
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
//        return (int) (this.getSalary()-o.getSalary());
//        return Double.compare(this.salary, o.getSalary());
        return this.getName().compareTo(o.getName());
    }

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getName().length() - o2.getName().length();
//    }

    public static Comparator<Employee> NameLengthComparator=new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().length()-o2.getName().length();
        }
    };

    static class SalaryComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o1.getSalary(), o2.getSalary());
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
