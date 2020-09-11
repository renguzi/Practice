package cn.how2j.JavaBasic.InterfaceAndInheritance;

/**
 * @Author:asher
 * @Date:2020/9/11 20:48
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
public class MagicPotion extends Item {
    @Override
    public void effect() {
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}
