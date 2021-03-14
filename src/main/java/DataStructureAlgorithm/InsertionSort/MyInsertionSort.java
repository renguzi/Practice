package DataStructureAlgorithm.InsertionSort;

/**
 * @Author:asher
 * @Date:2021/3/11 15:43
 * @Description:DataStructureAlgorithm.InsertionSort
 * @Version:1.0
 */
public class MyInsertionSort {
    private MyInsertionSort() { }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 3, 1, 5};
        MyInsertionSort.sort(arr);
        for (int k: arr ) {
            System.out.print(k+ " ");
        }

    }

}
