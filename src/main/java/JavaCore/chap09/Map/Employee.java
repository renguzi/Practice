package JavaCore.chap09.Map;

/**
 * @Author:asher
 * @Date:2020/9/11 09:45
 * @Description:JavaCore.chap09.Map
 * @Version:1.0
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
