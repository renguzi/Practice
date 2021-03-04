package DataStructureAlgorithm.Queue;

/**
 * @Author:asher
 * @Date:2021/3/4 09:46
 * @Description:DataStructureAlgorithm.Queue
 * @Version:1.0
 */
public class MyQueue {
    private String[] array;
    private int n;
    private int head;
    private int tail;

    public MyQueue(int capacity) {
        array = new String[capacity];
        head = 0;
        tail = 0;
        n = capacity;
    }

    public boolean enqueue(String s) {
        if (tail == n) {
            if ((head > 0) && (head < tail)) {
                for (int i = head; i  < tail; i++) {
                    array[i-head] = array[i];
                }
                tail = tail - head;
                array[tail] = s;
                tail++;
                head = 0;
                return true;
            } else {
                return false;
            }
        }
        array[tail] = s;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String temp = array[head];
        head++;
        return temp;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        for (int i = 0; i < 5; i++) {
            myQueue.enqueue(String.valueOf(i));
        }
        System.out.println(myQueue.dequeue());

        System.out.println(myQueue.enqueue("hello"));

        for (int i = 0; i < myQueue.n; i++) {
            System.out.print(myQueue.dequeue()+"  ");
        }
    }
}

