package DataStructureAlgorithm.LinearSearch;

import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2021/2/15 21:32
 * @Description:DataStructureAlgorithm.LinearSearch
 * @Version:1.0
 */
public class LinearSearch {
    private LinearSearch() {
    }

    public static <T> int getEle(T[] ints, T key) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(20);
        }
        System.out.println("数组为：");
        for (Integer k:integers ) {
            System.out.print(k+"  ");
        }
        System.out.println("输入你要查找的元素：");
        Scanner scanner = new Scanner(System.in);
        int key = LinearSearch.getEle(integers, scanner.nextInt());
        System.out.println("\n");
        System.out.println("查找的位置为：" + key);

        System.out.println("============Users search==========");
        User u1 = new User("Jim", 10);
        User u2 = new User("Kate", 8);
        User u3 = new User("Lilei", 12);
        User[] users = {u1, u2, u3};
        int zz = LinearSearch.getEle(users, new User("Kate", 8));
        System.out.println(zz);
    }

    @Test
    public void test() {
        int[] dataSize = {100000, 1000000};
        for (int n:dataSize ) {
            long startTime = System.currentTimeMillis();
//            for (int i = 0; i < 100; i++) {
                LinearSearch.getEle(ArrayGenerator.generator(n),n);
//            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }
    }
}
