package JavaCore.chap09.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author:asher
 * @Date:2020/9/6 18:56
 * @Description:JavaCore.chap09.linkedList
 * @Version:1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        LinkedList b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        //merge the words from b to a;

        ListIterator<String> aIter = a.listIterator();
        ListIterator<String> bIter = b.listIterator();
        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter=b.listIterator();
        while (bIter.hasNext()) {
               bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        //remove b from a

        a.removeAll(b);
        System.out.println(a);

    }
}
