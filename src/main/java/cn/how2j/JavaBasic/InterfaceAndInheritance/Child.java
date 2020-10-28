package cn.how2j.JavaBasic.InterfaceAndInheritance;

/**
 * @Author:asher
 * @Date:2020/10/23 10:12
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
public class Child extends Parent {

    public static void win() {
        System.out.println("child win");
    }

    @Override
    public void yeah() {
        System.out.println("child yeah");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.win();
        p.yeah();
    }
}
