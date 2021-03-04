package DataStructureAlgorithm.Queue;

/**
 * @Author:asher
 * @Date:2021/3/3 17:58
 * @Description:DataStructureAlgorithm.Queue
 * @Version:1.0
 */
public interface Queue<E> {
    public void enqueue(E e);

    public E dequeue();

    public E getFront();

    public int getSize();

    public boolean isEmpty();
}
