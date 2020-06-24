package JavaCore.chap05.inheritance;

/**
 * @Author:asher
 * @Date:2020/6/10 08:21
 * @Description:JavaCore.chap05.inheritance
 * @Version:1.0
 */
public class Manager extends Employee{
    public double bonus;
    public String xx;
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
