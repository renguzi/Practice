package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.*;

/**
 * @Author:asher
 * @Date:2021/2/3 16:52
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(collection);
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println(collection);
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        System.out.println(collection);
        Collections.addAll(collection, moreInts);
        System.out.println(collection);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        System.out.println(list.size());
        System.out.println(list);
        list.set(1, 99);
        System.out.println(list);
        list.add(21);
    }
}
