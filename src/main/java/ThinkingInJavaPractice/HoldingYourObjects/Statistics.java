package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/2/3 23:02
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(4756);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
