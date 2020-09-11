package cn.how2j.JavaBasic.InterfaceAndInheritance;

import cn.how2j.JavaBasic.ClassAndObjects.Hero;

/**
 * @Author:asher
 * @Date:2020/9/11 17:58
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
//物理、魔法混合攻击型英雄，继承Hero类，实现AD、AP接口
public class ADAPHero extends Hero implements AP,AD {
    @Override
    public void physicalAttack() {
        System.out.println("物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("魔法攻击");
    }
}
