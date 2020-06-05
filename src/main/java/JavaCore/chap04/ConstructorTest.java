package JavaCore.chap04;

import java.util.Random;

/**
 * @Author:asher
 * @Date:2020/6/5 22:31
 * @Description:JavaCore.chap04
 * @Version:1.0
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employe[] staff = new Employe[3];
        staff[0] = new Employe("Harry", 40000);
        staff[1] = new Employe(60000);
        staff[2] = new Employe();
        for (Employe e :
                staff) {
            System.out.println("name= " + e.getName() + " ,id= " + e.getId() + " ,salary=" + e.getSalary());
        }

    }
}

class Employe {
    private static int nextId;
    private int id;
    private String name = "";
    private double salary;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }

    public Employe(String n, double s) {
        name = n;
        salary = s;
    }
    public Employe(double s) {
        this("Employe #" + nextId, s);
    }

    public Employe() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
