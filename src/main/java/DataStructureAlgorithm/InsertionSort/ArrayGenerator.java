package DataStructureAlgorithm.InsertionSort;

import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/3/11 20:14
 * @Description:DataStructureAlgorithm.InsertionSort
 * @Version:1.0
 */
public class ArrayGenerator {
    private ArrayGenerator(){}

    public static Integer[] generateRandomArray(int n,int bound) {
        Integer[] randomArray = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = random.nextInt(bound);
        }
        return randomArray;
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] orderedArray = new Integer[n];
        for (int i = 0; i < orderedArray.length; i++) {
            orderedArray[i] = i;
        }
        return orderedArray;
    }

}
