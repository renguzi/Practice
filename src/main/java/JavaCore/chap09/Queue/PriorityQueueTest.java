package JavaCore.chap09.Queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @Author:asher
 * @Date:2020/9/9 19:46
 * @Description:JavaCore.chap09.Queue
 * @Version:1.0
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue= new PriorityQueue<LocalDate>();
        priorityQueue.add(LocalDate.of(1906, 12, 9));
        priorityQueue.add(LocalDate.of(1815, 12, 10));
        priorityQueue.add(LocalDate.of(1903, 12, 3));
        priorityQueue.add(LocalDate.of(1910, 6, 2));
        System.out.println("Iterating over elements....");
        for (Object o : priorityQueue) {
            System.out.println(o);
        }
        System.out.println("Removing elements");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
