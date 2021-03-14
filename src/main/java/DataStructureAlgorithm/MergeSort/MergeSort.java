package DataStructureAlgorithm.MergeSort;

import DataStructureAlgorithm.SelectionSort.ArrayGenerator;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2021/3/11 11:09
 * @Description:DataStructureAlgorithm.MergeSort
 * @Version:1.0
 */
public class MergeSort {

    private MergeSort(){}

    private static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static  <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {
//        E[] temp = Arrays.copyOf(arr, arr.length);
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];j++;
            } else if (j > r) {
                arr[k] = temp[i - l];i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];j++;
            }
        }
    }

    public static void main(String[] args) {
        int count=100000;
        Integer[] integers = ArrayGenerator.generateRandomArray(count, count);
        double t1 = System.currentTimeMillis();
        MergeSort.sort(integers);
        double t2 = System.currentTimeMillis();
        System.out.println("MergeSort time: " + (t2 - t1));
    }
}
