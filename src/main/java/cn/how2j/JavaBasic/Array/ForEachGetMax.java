package cn.how2j.JavaBasic.Array;

/**
 * @Author:asher
 * @Date:2020/9/10 15:37
 * @Description:cn.how2j.JavaBasic.Array
 * @Version:1.0
 */
public class ForEachGetMax {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        int max = a[0];
        for (int k: a ) {
            if (k > max) {
                max = k;
            }
            //输出数组元素值：
            System.out.println(k);
        }
        System.out.println("最大值为：" + max);
    }
}
