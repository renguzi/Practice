package cn.how2j.JavaBasic.InterfaceAndInheritance;

import sun.jvm.hotspot.gc_implementation.g1.HeapRegion;

/**
 * @Author:asher
 * @Date:2020/10/22 17:49
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
public class Hero {
    public String name;  //名字
    protected float hp;  //血量
    float armor;    //护甲
    int moveSpeed;   //移动速度

    public Hero() {
    }

    public void useItem(Item item) {
        System.out.println("here use item");
        item.effect();
    }

//    public Hero() {
//        System.out.println("Hero的无参构造方法");
//    }

    public Hero(String name) {
        System.out.println("Hero的有参构造方法");
    }

    //    类方法，静态方法
    public static void battleWin() {
        System.out.println("here battle win");
    }

    public static void main(String[] args) {
        new Hero();
    }
}
