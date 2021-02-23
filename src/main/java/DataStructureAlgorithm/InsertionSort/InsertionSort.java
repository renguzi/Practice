package DataStructureAlgorithm.InsertionSort;

import DataStructureAlgorithm.SelectionSort.ArrayGenerator;
import DataStructureAlgorithm.SelectionSort.SortingHelper;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2021/2/19 16:20
 * @Description:DataStructureAlgorithm.InsertSort
 * @Version:1.0
 */
public class InsertionSort {
    private InsertionSort(){}

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j>=1 ; j--) {
                if (arr[j].compareTo(arr[j-1])<0) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort2(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //将arr[i]插入到合适的位置
            T temp = arr[i];
            int j;
            for (j = i; j-1>=0 && temp.compareTo(arr[j-1])<0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        System.out.println("Random array:InsertionSort VS SelectionSort:");
        for (int n:dataSize ) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort2", arr);
            SortingHelper.sortTest("SelectionSort", arr2);
        }

        System.out.println("Ordered array:InsertionSort VS SelectionSort:");
        for (int n:dataSize ) {
            Integer[] arr = ArrayGenerator.generateOrderedArray(n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort2", arr);
            SortingHelper.sortTest("SelectionSort", arr2);
        }

    }
}
