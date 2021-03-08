package DataStructureAlgorithm.SelectionSort;

import java.nio.channels.Selector;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/3/4 19:52
 * @Description:DataStructureAlgorithm.SelectionSort
 * @Version:1.0
 */

class User implements Comparable<User>{
    private String name;
    private int height;
    private int age;

    public User(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(User user) {
        if (this.height != user.height) {
            return this.height - user.height;
        } else {
            return this.age - user.age;
        }

//        if (this.height < user.height) {
//            return -1;
//        }
//        if (this.height > user.height) {
//            return 1;
//        }
//        if (this.height == user.height) {
//            if (this.age<user.age) return -1;
//            if (this.age>user.age) return 1;
//        }
//        return 0;
    }

    @Override
    public String toString() {
        return "User: name= "+name+" height="+height+" age="+age;
    }
}

public class MySelectionSort {
    private MySelectionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = arr.length-1; i > 1; i--) {
            int minIndex = i;
            for (int j = i-1; j >0; j--) {
                if (arr[j].compareTo(arr[minIndex])<0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static <T extends Comparable> void sortSlow(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int count=50000;
        Integer[] arr1 = new Integer[count];
        for (int i = 0; i <count; i++) {
            arr1[i] = random.nextInt(count);
        }
//        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length/10);
        Integer[] arr2 = new Integer[count/10];
        for (int i = 0; i < count / 10; i++) {
            arr2[i] = random.nextInt(count);
        }
        long t1=System.currentTimeMillis();
        MySelectionSort.sort(arr1);
        long t2 = System.currentTimeMillis();
        System.out.println("sort time ms:"+ (t2 - t1));

        long t3=System.currentTimeMillis();
//        MySelectionSort.sortSlow(arr2);
        MySelectionSort.sort(arr2);
        System.out.println(arr2.length);
        long t4 = System.currentTimeMillis();
        System.out.println("sortSlow time ms:"+ (t4 - t3));

        User[] users = {new User("Jim", 120, 7),
                        new User("kate", 120, 7),
                        new User("Tom", 110, 5)};

        MySelectionSort.sort(users);
        for (User u: users ) {
            System.out.println(u);
        }

        Integer[] arr3 = ArrayGenerator.generateRandomArray(10000, 10000);
        Integer[] arr4 = ArrayGenerator.generateRandomArray(100000, 100000);
        long t5=System.currentTimeMillis();
        MySelectionSort.sort(arr3);
        long t6 = System.currentTimeMillis();
        System.out.println("10000 time: " + (t6 - t5)/1000.0);

        long t7=System.currentTimeMillis();
        MySelectionSort.sort(arr4);
        long t8 = System.currentTimeMillis();
        System.out.println("100000 time: " + (t8 - t7)/1000.0);



    }
}
