package cn.how2j.JavaBasic.ClassAndObjects;

/**
 * @Author:asher
 * @Date:2020/9/11 17:42
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class RoleTest {
    public static void main(String[] args) {
        for (Role r:Role.values() ) {
//            System.out.println(r);
            switch (r) {
                case TANK:
                    System.out.println("坦克");break;
                case PUSH:
                    System.out.println("推进");break;
                case ASSIST:
                    System.out.println("辅助");break;
                case RANGED:
                    System.out.println("远程");break;
                case WIZARD:
                    System.out.println("巫师");break;
                case FARMING:
                    System.out.println("打野");break;
                case WARRIOR:
                    System.out.println("勇士");break;
                case ASSASSIN:
                    System.out.println("刺客");break;
            }
        }
    }
}
