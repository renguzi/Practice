package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/2/4 11:34
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove());
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i + 10));
        }
        printQ(queue);

        Queue<Character> qc = new LinkedList<>();
        for (Character c:"Restaurant".toCharArray() ) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
