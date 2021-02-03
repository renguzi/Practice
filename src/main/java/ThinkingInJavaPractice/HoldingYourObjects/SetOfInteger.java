package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author:asher
 * @Date:2021/2/3 23:08
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(417);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(30));
        }
        System.out.println(set);

    }
}
