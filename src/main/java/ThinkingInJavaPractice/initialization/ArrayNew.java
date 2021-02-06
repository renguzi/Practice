package ThinkingInJavaPractice.initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/2/6 20:23
 * @Description:ThinkingInJavaPractice.initialization
 * @Version:1.0
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(4747);
        a = new int[random.nextInt(20)];
        System.out.println("length of a= " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
