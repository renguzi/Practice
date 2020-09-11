package cn.how2j.JavaBasic.ClassAndObjects;

/**
 * @Author:asher
 * @Date:2020/9/10 16:32
 * @Description:cn.how2j.JavaBasic.ClassAndObjects
 * @Version:1.0
 */
public class Hero {
    public String name;
    protected float hp;//血量
    float armor;//护甲登记
    int moveSpeed;//移动速度

    public Hero() {

    }

    public void showAddressInMemory() {
        System.out.println("打印this看到的虚拟地址：" + this);
    }

    public Hero(String heroName, float heroHP, float heroArmor, int moveSpeed) {
        name = heroName;
        hp = heroHP;
        armor = heroArmor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero h3;
        Hero h4;
        h3 = h1;
        h4 = h3;

        if (h4 == h2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Hero garen = new Hero();
        garen.name = "盖伦";
        System.out.println("打印对象看到的虚拟地址：" + garen);
        garen.showAddressInMemory();

        Hero timo = new Hero();
        timo.name = "提莫";
        System.out.println("打印对象看到的虚拟地址：" + timo);
        timo.showAddressInMemory();

    }
}
