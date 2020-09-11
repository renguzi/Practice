package cn.how2j.JavaBasic.ClassAndObjects;

/**
 * @Author:asher
 * @Date:2020/9/11 16:51
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class EagerSingleton {
    //私有构造方法使得该类无法在外部通过new来实例化
    private EagerSingleton() {
    }

    //准备一个类属性，让其指向一个实例化对象。因为是类属性(static修饰的)，所以只有一个，这样才决定了其是单例的。
    private static EagerSingleton instance = new EagerSingleton();

    //public static方法，提供给调用者，用于获取单例对象
    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e1 == e2);
    }
}
