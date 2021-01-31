package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2021/1/31 11:21
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}
public class AppleAndOracleWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (Object obj : apples) {
            ((Apple) obj).id();
        }

        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
    }
}
