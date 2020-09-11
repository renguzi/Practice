package cn.how2j.JavaBasic.InterfaceAndInheritance;

import cn.how2j.JavaBasic.ClassAndObjects.Hero;

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
}
