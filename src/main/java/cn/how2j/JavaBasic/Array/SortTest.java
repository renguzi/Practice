package cn.how2j.JavaBasic.Array;

/**
 * @Author:asher
 * @Date:2020/9/10 15:23
 * @Description:cn.how2j.JavaBasic.Array
 * @Version:1.0
 */
public class SortTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("排序前：");
        for (int k: a ) {
            System.out.println(k);
        }

        //选择正排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("选择正排序的结果是：");
        for (int k: a ) {
            System.out.println(k);
        }

       //冒泡倒排序
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡倒排序结果：");
        for (int k : a) {
            System.out.println(k);
        }
    }
}
