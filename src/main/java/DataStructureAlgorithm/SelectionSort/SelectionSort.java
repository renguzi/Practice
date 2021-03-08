package DataStructureAlgorithm.SelectionSort;

/**
 * @Author:asher
 * @Date:2021/2/18 15:22
 * @Description:DataStructureAlgorithm.SelectionSort
 * @Version:1.0
 */
public class SelectionSort {

    private SelectionSort() {
    }

    /**
     *
     * @param arr
     * 假定第一个是最小的元素，然后从第二个开始，从里面选择一个最小的元素出来，如果还小于第一个元素，则他俩交换位置。
     * 然后，从第二个元素开始，假定第二个是最小的元素，从第3个一直到最后，选择一个最小的元素和第二个元素比较，如果小于
     * 第二个元素，则交换位置。依次下去。
     * 这里，一个比较聪明的办法就是，选择最小的元素时，通过记录元素下标，而不是直接记录元素本身。
     *
     *
     * 选择排序的核心思想，就是每次选择1个最小的元素，然后和第一个元素交换位置
     *
     * 这里，有一个聪明的方式，就是假定第一个就是最小的元素，并把它的位置赋给一个变量
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {

        //arr[0,i)是有序的，arr[i,n)是无序的
        for (int i = 0; i < arr.length-1; i++) {
          //选择arr[i,n)中的最小元素的下标
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j].compareTo(arr[minIndex])<0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static <T extends Comparable<T>> void reverseSort(T[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            int maxIndex = i;
            for (int j = i; j >=0 ; j--) {
                if (arr[j].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }
    }

    private  static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 4, 1, 6,5,3,2,1};
        SelectionSort.reverseSort(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
        SortingHelper.sortTest("SelectionSort", arr);
        System.out.println("\n");

        Student[] students = {new Student("Allen", 88), new Student("leilei", 99),
                new Student("Allen", 100)};
        SelectionSort.sort(students);
        for (Student s: students ) {
            System.out.println(s);
        }
        if (!SortingHelper.isSorted(students)) {
            throw new RuntimeException("SelectionSort failed");
        }

        int[] dataSize = {10000, 100000};
        for (int k:dataSize ) {
            Integer[] array = ArrayGenerator.generateRandomArray(k, k);
            SortingHelper.sortTest("SelectionSort", array);
        }
    }
}
