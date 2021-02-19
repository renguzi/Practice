package DataStructureAlgorithm.SelectionSort;

/**
 * @Author:asher
 * @Date:2021/2/19 10:34
 * @Description:DataStructureAlgorithm.SelectionSort
 * @Version:1.0
 */
public class SortingHelper {
    private SortingHelper() {
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        for (int i = 1; i <arr.length; i++) {
            if (arr[i-1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> void sortTest(String sortName,T[] arr){
        long beginTime = System.currentTimeMillis();
        if (sortName.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        }
        long endTime = System.currentTimeMillis();
        double time = (endTime - beginTime) / 1000.0;
        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(sortName+" failed");
        }
        System.out.println(String.format("%s ,%d ,%s s",sortName,arr.length,time));
    }





}
