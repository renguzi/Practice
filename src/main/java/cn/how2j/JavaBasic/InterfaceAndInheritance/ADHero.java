package cn.how2j.JavaBasic.InterfaceAndInheritance;

/**
 * @Author:asher
 * @Date:2020/9/11 17:54
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
//物理攻击性英雄,继承Hero类，实现物理攻击性接口
public class ADHero extends Hero implements AD {
    @Override
    public void physicalAttack() {
        System.out.println("进行物理攻击");
    }

    //隐藏父类的battleWin方法
    public static void battleWin() {
        System.out.println("ad hero battle win");
    }

    public ADHero() {
        System.out.println("AD Hero的构造方法");
    }

    public ADHero(String name) {
        super(name);
        System.out.println("AD Here的有参构造方法");
    }

    public static void main(String[] args) {
//        cn.how2j.JavaBasic.InterfaceAndInheritance.Hero.battleWin();
//        ADHero.battleWin();
//
        ADHero adHero = new ADHero("delaiwen");
    }
}
