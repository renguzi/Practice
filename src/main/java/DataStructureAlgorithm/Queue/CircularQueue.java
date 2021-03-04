package DataStructureAlgorithm.Queue;

/**
 * @Author:asher
 * @Date:2021/3/4 10:35
 * @Description:DataStructureAlgorithm.Queue
 * @Version:1.0
 */
public class CircularQueue {
    private String[] array;
    private int size;
    private int head;
    private int tail;

    public CircularQueue(int capacity) {
        array = new String[capacity];
        size = capacity;
        head = 0;
        tail = 0;
    }

    public boolean enqueue(String s) {
        if ((tail + 1) % size == head) {
            return false;
        }
        array[tail] = s;
        tail = (tail + 1) % size;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String temp = array[head];
        head = (head + 1) % size;
        return temp;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        for (int i = 0; i < circularQueue.size; i++) {
            System.out.println(circularQueue.enqueue(String.valueOf(i)));
        }

        for (int i = 0; i < circularQueue.size; i++) {
            System.out.println(circularQueue.dequeue());
        }
    }

}
