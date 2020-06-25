package JavaCore.chap05.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author:asher
 * @Date:2020/6/25 11:57
 * @Description:JavaCore.chap05.reflection
 * @Version:1.0
 */
public class ReflectionGetEmployeeFields {
    public static void main(String[] args) {
        Employee employee = new Employee("huangwei", 38);
        Class c = employee.getClass();
        try {
            Field fieldName = c.getField("name");
            System.out.println(fieldName.getType() + fieldName.getName());
            System.out.println(Modifier.toString(fieldName.getModifiers()));
            Object o = fieldName.get(employee);
            System.out.println(o.toString());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Field fieldAge = c.getDeclaredField("age");
            System.out.print(Modifier.toString(fieldAge.getModifiers())+" ");
            System.out.print(fieldAge.getType().getName() + " " + fieldAge.getName());
            fieldAge.setAccessible(true);
            Object o = fieldAge.get(employee);
            System.out.println(o.toString());
            fieldAge.set(employee, 33);
            System.out.println(fieldAge.get(employee));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
