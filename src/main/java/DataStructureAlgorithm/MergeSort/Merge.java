package DataStructureAlgorithm.MergeSort;

import DataStructureAlgorithm.LinkedList1.Queue;
import DataStructureAlgorithm.Queue.ArrayQueue;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2021/3/11 09:57
 * @Description:DataStructureAlgorithm.MergeSort
 * @Version:1.0
 */
public class Merge {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            arr[arr1.length + i] = arr2[i];
//        }
        ArrayQueue arrayQueue = new ArrayQueue();
        for (int i = 0; i < arr1.length; i++) {
            arrayQueue.enqueue(arr1[i]);

        }

        ArrayQueue q2 = new ArrayQueue();
        for (int i = 0; i < arr2.length; i++) {
            q2.enqueue(arr2[i]);
        }

        int[] temp = Arrays.copyOf(arr, arr.length);

        System.out.println("temp:"+temp);

        int i=0,j=0;
        for (int k = 0; k < arr.length; k++) {
            if (i > arr1.length) {
                arr[k] = temp[j];j++;
            } else if (j > arr2.length) {
                arr[k] = temp[i];i++;
            } else if (temp[i] < temp[j]) {
                arr[k] = temp[i];i++;
            } else {
                arr[k] = temp[j];j++;
            }
        }

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] < arr2[j]) {
//                    arr[i] = arr1[i];
//                    break;
//                } else {
//                    arr[j] = arr2[j];
////                    break;
//                }
//                if (j == arr2.length) {
//                    break;
//                }
//            }
//            arr[arr2.length + i] = arr1[i];
//        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {22, 33, 47};
        for (int k : Merge.merge(arr1, arr2) ) {
            System.out.print(k+"  ");
        }
    }
}
