package JavaCore.chap09.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author:asher
 * @Date:2020/9/6 19:16
 * @Description:JavaCore.chap09.set
 * @Version:1.0
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet words = new HashSet<String>();
        long totalTime = 0;
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.nextLine();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iterator = words.iterator();
        for (int i = 0; i < 20 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
        System.out.println("....");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
