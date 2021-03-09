package DataStructureAlgorithm.LinkedList1;

/**
 * @Author:asher
 * @Date:2021/3/9 14:50
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public class Sum {
    private static int sum(int[] arr) {
//        return add(arr, arr.length-1);
        return qiuHe(arr, 0);
    }

    private static int qiuHe(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + qiuHe(arr, l+1);
    }

    private static int add(int[] arr, int l) {
        if (l == 0) {
            return arr[0];
        }

        return arr[l] + add(arr, l - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
}
