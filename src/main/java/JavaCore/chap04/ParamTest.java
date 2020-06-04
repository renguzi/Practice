package JavaCore.chap04;

/**
 * @Author:asher
 * @Date:2020/6/4 15:25
 * @Description:JavaCore.chap04
 * @Version:1.0
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before :percent=" + percent);
        tripleValue(percent);
        System.out.println("After :percent=" + percent);
        System.out.println("Testing tripleSalary");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());
        System.out.println("Testing swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 40000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After : a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp=x;
        x=y;
        y=temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }

}

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercet) {
        double raise = salary * byPercet / 100;
        salary = raise + salary;
    }
}
