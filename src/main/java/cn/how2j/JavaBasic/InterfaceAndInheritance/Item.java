package cn.how2j.JavaBasic.InterfaceAndInheritance;

/**
 * @Author:asher
 * @Date:2020/9/11 20:46
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
public class Item {
    String name;
    int price;

    public void buy() {
        System.out.println("购买");
    }

    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
}
