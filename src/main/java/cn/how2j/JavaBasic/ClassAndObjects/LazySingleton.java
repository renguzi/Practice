package cn.how2j.JavaBasic.ClassAndObjects;

import javafx.scene.control.Label;

/**
 * @Author:asher
 * @Date:2020/9/11 17:01
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class LazySingleton {
    //私有构造方法，在类外部无法通过new方式来实例化对象
    private LazySingleton() {
    }

    //提供类属性，所以是static来修饰的，这样才有可能是单例模式的。不像饿汉式那样，一上来就初始化；
    private static LazySingleton instance;

    //public static,提供给外部，用于获取但是模式对象。区别于饿汉式的是，如果它是第一次调用，它==null的时候，我才去实例化它，通过调用构造方法去实例化。
    //否则的话，我直接return它就OK了
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1 == l2);
    }
}
