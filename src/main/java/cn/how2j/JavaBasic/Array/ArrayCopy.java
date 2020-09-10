package cn.how2j.JavaBasic.Array;

import java.util.Map;

/**
 * @Author:asher
 * @Date:2020/9/10 15:46
 * @Description:cn.how2j.JavaBasic.Array
 * @Version:1.0
 */
public class ArrayCopy {
    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 5)+5);
        int aLength = (int) (Math.random() * 5 + 5);
        int bLength = (int) (Math.random() * 5 + 5);
        int[] a = new int[aLength];
        int[] b = new int[bLength];
        for (int i = 0; i < aLength; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i <bLength ; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        int[] c = new int[aLength + bLength];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length , b.length);
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("bbbbbbbbbbbbbbbbbb");
        for (int i : b) {
            System.out.println(i);
        }
        System.out.println("ccccccccccccccccc");
        for (int k: c ) {
            System.out.println(k);
        }
    }
}
