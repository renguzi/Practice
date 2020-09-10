package JavaCore.chap09.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author:asher
 * @Date:2020/9/6 20:08
 * @Description:JavaCore.chap09.treeSet
 * @Version:1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);
        System.out.println(parts.comparator());

        TreeSet<Item> sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
        System.out.println(sortByDescription.comparator());
    }

}
