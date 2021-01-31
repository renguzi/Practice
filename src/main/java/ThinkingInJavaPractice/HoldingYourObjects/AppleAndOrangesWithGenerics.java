package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2021/1/31 12:55
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class AppleAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple a : apples) {
            System.out.println(a.id());
        }
    }
}
