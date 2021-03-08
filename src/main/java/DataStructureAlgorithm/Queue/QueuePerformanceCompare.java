package DataStructureAlgorithm.Queue;

import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/3/4 16:18
 * @Description:DataStructureAlgorithm.Queue
 * @Version:1.0
 */
public class QueuePerformanceCompare {

    private static double test(Queue<Integer> queue, int count) {
       double beginTime=System.currentTimeMillis();
       Random random=new Random();
        for (int i = 0; i < count; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < count; i++) {
            queue.dequeue();
        }

       double endTime=System.currentTimeMillis();

        return (endTime - beginTime) / 1000.0;
    }

    public static void main(String[] args) {
        int count = 1000000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double t1 = test(arrayQueue, count);
        System.out.println("ArrayQueue testing: time " + t1);

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double t2 = test(loopQueue, count);
        System.out.println("LoopQueue testing: time " + t2);
    }
}
