package DataStructureAlgorithm.SelectionSort;

import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/2/19 10:14
 * @Description:DataStructureAlgorithm.SelectionSort
 * @Version:1.0
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
