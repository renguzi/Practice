package DataStructureAlgorithm.Queue;


/**
 * @Author:asher
 * @Date:2021/3/4 11:36
 * @Description:DataStructureAlgorithm.Queue
 * @Version:1.0
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] array;
    private int head;
    private int tail;
    private int size;

    public LoopQueue(int capacity) {
        array = (E[])(new Object[capacity + 1]);
        head = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return array.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % array.length == head) {
            resize(getCapacity() * 2);
        }
        array[tail]  = e;
        tail = (tail + 1) % array.length;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newArray = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(i + head) % array.length];
        }
        array = newArray;
        head = 0;
        tail = size;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot deque from an empty queue");
        }
        E ret = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return array[head];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(String.format("Queue: size= %d, capacity= %d\n ", size, getCapacity()));
        stringBuilder.append("head [");
        for (int i = head; i != tail; i = (i + 1) % array.length) {
            stringBuilder.append(array[i]);
            if ((i + 1) % array.length != tail) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] tail");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            loopQueue.enqueue(i);
            System.out.println(loopQueue);

            if (i % 3 == 2) {
                loopQueue.dequeue();
                System.out.println(loopQueue);
            }
        }
    }
}
