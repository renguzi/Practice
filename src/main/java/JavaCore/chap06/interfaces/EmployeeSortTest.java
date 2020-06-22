package JavaCore.chap06.interfaces;


import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/6/22 10:39
 * @Description:JavaCore.chap06.interfaces
 * @Version:1.0
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony tester", 38000);
        System.out.println("Before order:");
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + " salary=" + e.getSalary());
        }
        System.out.println("after order:");
        Arrays.sort(staff);
        for (Employee e : staff) {
            System.out.println("name= " + e.getName() + " salary=" + e.getSalary());
        }
        Arrays.sort(staff, Employee.NameLengthComparator);
        System.out.println("Order by Name length:" + Arrays.toString(staff));
        System.out.println("============");
        Arrays.sort(staff, new Employee.SalaryComparator());
        System.out.println("Order by salary:" + Arrays.toString(staff));
    }
}
