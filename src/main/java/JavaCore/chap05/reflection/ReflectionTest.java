package JavaCore.chap05.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2020/6/23 14:38
 * @Description:JavaCore.chap05.reflection
 * @Version:1.0
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name(eg. java.util.Date):");
            name=scanner.nextLine();
        }
        System.out.println("The constructors are:");
        printConstructors(Class.forName(name));
        printFields(Class.forName(name));
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            Class[] parameterTypes = c.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                if (j>0)
                    System.out.print(", ");
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getFields();
        System.out.println(fields.length);
        for (int i = 0; i < fields.length; i++) {
            String modifiers = Modifier.toString(fields[i].getModifiers());
            System.out.print(modifiers + " ");
            System.out.println(fields[i].getName());
        }
    }
}
