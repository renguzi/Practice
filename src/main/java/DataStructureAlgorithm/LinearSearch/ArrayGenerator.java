package DataStructureAlgorithm.LinearSearch;

/**
 * @Author:asher
 * @Date:2021/2/18 12:26
 * @Description:DataStructureAlgorithm.LinearSearch
 * @Version:1.0
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generator(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }

}
