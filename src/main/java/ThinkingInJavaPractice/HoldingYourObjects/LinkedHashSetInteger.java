package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author:asher
 * @Date:2021/2/3 23:11
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class LinkedHashSetInteger {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        Random random = new Random(101);
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(30));
        }
        System.out.println(set);
    }
}
