package ThinkingInJavaPractice.initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/2/6 20:25
 * @Description:ThinkingInJavaPractice.initialization
 * @Version:1.0
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a :" + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(400);
        }
        System.out.println(Arrays.toString(a));
    }
}
