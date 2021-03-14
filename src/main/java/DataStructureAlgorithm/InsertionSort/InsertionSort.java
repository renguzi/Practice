package DataStructureAlgorithm.InsertionSort;

import java.util.Arrays;
import java.util.SortedSet;

/**
 * @Author:asher
 * @Date:2021/2/19 16:20
 * @Description:DataStructureAlgorithm.InsertSort
 * @Version:1.0
 */
public class InsertionSort {
    private InsertionSort(){}

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j>=1 ; j--) {
                if (arr[j].compareTo(arr[j-1])<0) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort2(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //将arr[i]插入到合适的位置
            T temp = arr[i];
            int j;
            for (j = i; j-1>=0 && temp.compareTo(arr[j-1])<0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    //带泛型的插入排序算法
    public static <T extends Comparable<T>> void sortPlus(T[] arr){
        //从抓到的这第i张牌的位置开始，外层循环从[i,arr.length)的元素仍然是未排序的
        for(int i=0;i<arr.length;i++){
            //把这个第i张牌“拿走”，放到一个新的地方temp处存放，
            T temp=arr[i];
            //另起一个变量，让它等于第张牌的位置开始，从i到i-1,从右到左的顺序，开始循环。把这个变量放在循环外面的原因是，当我们把6，8，9三张已排序的牌，依次顺移之后，如果前面再没有比它大的元素的话，这个变量j正好要放我们拿走的那个第i张牌，即5应该放的位置。且，我们还要再次用到它，如果放到for loop里面的话，离开loop之后，它的作用域就消失了，我们无法用到它
            int j;
            for(j=i;j>0;j--){
                //从“拿走的”这个第i张牌位置开始，从右到左，如果相邻的两张牌，左边的牌<右边的牌，则通过右边的牌=左边的牌的赋值方法，来实现依次顺移的操作
                if (temp.compareTo(arr[j - 1]) < 0) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            //好了，所有小于我们拿走的那个第i张牌，依次顺移走了。此时，j就是我们拿走的那个第i张应该放入的位置，把它放进去就结束这一轮的顺移操作。我们又从第i+1张牌开始，重复此过程。这就省去了逐个交换位置的操作了。
            arr[j]=temp;
        }
    }
    public static <T extends Comparable<T>> void sort3(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T temp = arr[i];
            int j;
            for (j = i; j >0 ; j--) {
                if (temp.compareTo(arr[j - 1])<0 ) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[j] =temp;
        }

    }
    public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        Integer[] a = { 3, 1, 5};
////        InsertionSort.sort(a);
//        InsertionSort.sortPlus(a);
////        InsertionSort.sort3(a);
////        InsertionSort.sort2(a);
//        for (Integer k:a ) {
//            System.out.println(k);
//
//        }
        int[] dataSize = {10000, 100000};
        System.out.println("Random array:InsertionSort VS SelectionSort:");
        for (int n:dataSize ) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSortPlus",arr2);
        }
////
        System.out.println("Ordered array:InsertionSort VS SelectionSort:");
        for (int n:dataSize ) {
            Integer[] arr = ArrayGenerator.generateOrderedArray(n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSort", arr2);
        }
        Student[] students={new Student("Jim",120,7),
                new Student("Kate",120,7),
                new Student("Tom",110,5)};
        InsertionSort.sort3(students);
        for(Student stu:students){
            System.out.println(stu);
        }
         int n=10000;
        int[] size = {10000,100000};
        for (int i = 0; i < size.length; i++) {
            Integer[] integers = ArrayGenerator.generateRandomArray(size[i], size[i]);
            Integer[] copy = Arrays.copyOf(integers, integers.length);
//        SortingHelper.sortTest("InsertionSort", integers);
//        SortingHelper.sortTest("SelectionSort", copy);
        }
//        Student: name=Tom height=110 age=5
//        Student: name=Jim height=120 age=7
//        Student: name=Kate height=120 age=7
//        InsertionSort ,10000 ,0.226 s
//        InsertionSort ,100000 ,24.634 s

        int count = 100000;
//        Integer[] randomArray = ArrayGenerator.generateRandomArray(count, count);
//        Integer[] randomCopy = Arrays.copyOf(randomArray, randomArray.length);
//        SortingHelper.sortTest("SelectionSort", randomArray);
//        SortingHelper.sortTest("InsertionSort", randomCopy);
//
//        Integer[] orderedArray = ArrayGenerator.generateOrderedArray(count);
//        Integer[] orderedCopy = Arrays.copyOf(orderedArray, orderedArray.length);
//
//        SortingHelper.sortTest("SelectionSort", orderedArray);
//        SortingHelper.sortTest("InsertionSort", orderedCopy);

    }
}
