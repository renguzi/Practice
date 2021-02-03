package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.Random;
import java.util.TreeSet;

/**
 * @Author:asher
 * @Date:2021/2/3 23:13
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(30));
        }
        System.out.println(set);
    }
}
