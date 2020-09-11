package cn.how2j.JavaBasic.ClassAndObjects;

/**
 * @Author:asher
 * @Date:2020/9/10 16:38
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class Armor extends Item {
    int ac;

    @Override
    public String toString() {
        return "Armor{" +
                "ac=" + ac +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Armor armor1 = new Armor();
        armor1.ac = 65;
        armor1.name = "布甲";
        armor1.price = 200;

        Armor armor2 = new Armor();
        armor2.ac = 101;
        armor2.name = "锁子甲";
        armor2.price = 300;

        System.out.println(armor1);
        System.out.println(armor2);
    }
}
