package cn.how2j.JavaBasic.InterfaceAndInheritance;

import cn.how2j.JavaBasic.ClassAndObjects.Hero;

/**
 * @Author:asher
 * @Date:2020/9/11 18:01
 * @Description:cn.how2j.JavaBasic.InterfaceAndInheritance
 * @Version:1.0
 */
//辅助英雄类，继承英雄类，同时实现治疗接口
public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("进行治疗");
    }
}
