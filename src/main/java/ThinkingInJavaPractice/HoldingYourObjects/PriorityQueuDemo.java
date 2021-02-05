package ThinkingInJavaPractice.HoldingYourObjects;

import java.util.*;

/**
 * @Author:asher
 * @Date:2021/2/4 12:09
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class PriorityQueuDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> list = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        System.out.println(list);
        priorityQueue = new PriorityQueue<Integer>(list);
        System.out.println("begin.");
        QueueDemo.printQ(priorityQueue);
        System.out.println("end.");

        priorityQueue = new PriorityQueue<Integer>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        QueueDemo.printQ(priorityQueue);
    }
}
