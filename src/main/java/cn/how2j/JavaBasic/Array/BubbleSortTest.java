package cn.how2j.JavaBasic.Array;

/**
 * @Author:asher
 * @Date:2020/9/10 09:59
 * @Description:cn.how2j.JavaBasic.Array
 * @Version:1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before sorted:");
        for (int i:array ) {
            System.out.println(i);
        }

        for (int i = 0; i < array.length-1; i++) {
            //加入标志位，用于判断是否还需要继续冒泡，对于有些情况下，数据已经是有序的，就不再需要排序了
            boolean flag = false;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    flag = true;
                }
                if (!flag)
                    break;
            }
        }
        System.out.println("After Bubble sorted:");
        for (int k: array ) {
            System.out.println(k);
        }
    }
}
