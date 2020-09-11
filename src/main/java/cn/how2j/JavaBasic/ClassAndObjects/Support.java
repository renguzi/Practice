package cn.how2j.JavaBasic.ClassAndObjects;

/**
 * @Author:asher
 * @Date:2020/9/10 16:48
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class Support extends Hero {
    public void heal() {
        System.out.println("给英雄加血");
    }

    public void heal(Hero hero) {
        System.out.println("给英雄" + hero.name + "加血");

    }

    public void heal(Hero hero, int hp) {
        System.out.println("给英雄" + hero.name + "加了" + hp + "的血");
    }

}
