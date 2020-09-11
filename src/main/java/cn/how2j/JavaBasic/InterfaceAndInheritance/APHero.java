package cn.how2j.JavaBasic.InterfaceAndInheritance;

import cn.how2j.JavaBasic.ClassAndObjects.Hero;

/**
 * @Author:asher
 * @Date:2020/9/11 17:56
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
//魔法攻击型英雄
public class APHero extends Hero implements AP {


    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
