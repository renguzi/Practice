package com.journaldev.annotation;

/**
 * @Author:asher
 * @Date:2020/6/1 10:58
 * @Description:com.journaldev.annotation
 * @Version:1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        BaseClass baseClass = new ChildClass();
        /**
         * 如果父类的该方法签名保持String的话，则当作子类复写父类的该方法来执行；
         * 如果父类的该方法签名改为Object str的话，则子类的该方法当作重载父类的该方法。
         */
        baseClass.doSomething("override");
    }
}
