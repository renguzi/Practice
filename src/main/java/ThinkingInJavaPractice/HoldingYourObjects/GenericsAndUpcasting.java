package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2021/1/31 13:08
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
