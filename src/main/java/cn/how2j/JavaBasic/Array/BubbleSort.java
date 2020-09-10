package cn.how2j.JavaBasic.Array;

/**
 * @Author:asher
 * @Date:2020/9/10 15:14
 * @Description:cn.how2j.JavaBasic.Array
 * @Version:1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before Bubble sort...");
        for (int k : a) {
            System.out.println(k);
        }
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        System.out.println("After Bubble sort....");
        for (int k : a) {
            System.out.println(k);
        }
    }
}
