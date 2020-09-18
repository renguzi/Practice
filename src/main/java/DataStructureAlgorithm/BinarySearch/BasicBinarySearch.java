package DataStructureAlgorithm.BinarySearch;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/9/15 10:27
 * @Description:DataStructureAlgorithm.BinarySearch
 * @Version:1.0
 */
public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] a = new int[20];
//        a[0] = 203;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
          Arrays.sort(a);
        for (int i: a ) {
            System.out.print(i+"  ");
        }
//        Arrays.sort(a);
        System.out.println("-------------");
        System.out.println((0 + a.length) / 2);
        System.out.println(binarySearch(a, a.length, 23));

    }

    //从长度为n的整型数组中，查找元素value出现的位置，一旦出现，就返回其位置，不考虑重复出现。如果没有，返回-1；
    public static int binarySearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        //不直接写成mid=(low+high)/2的原因是，low+high的值有可能会溢出，超过int的最大值。
        while (low <= high) {
            int mid = low + ((-low + high) >> 1);
//            int mid = (high + low) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
//                System.out.println("low:" + low);
            } else if (a[mid] > value) {
                high = mid - 1;
//                System.out.println("high:" + high);
            }
        }
        return -1;
    }
}
