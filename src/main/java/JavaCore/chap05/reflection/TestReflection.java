package JavaCore.chap05.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author:asher
 * @Date:2020/6/23 11:25
 * @Description:JavaCore.chap05.Reflection
 * @Version:1.0
 */
public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String className = "java.util.Random";
        Class cl = Class.forName(className);
        Object o = cl.newInstance();
        Object o1 = cl.getConstructor().newInstance();
        System.out.println(o.getClass().getName());
        System.out.println(o1);
    }
}
