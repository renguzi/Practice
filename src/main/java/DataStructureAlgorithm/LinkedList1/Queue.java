package DataStructureAlgorithm.LinkedList1;

/**
 * @Author:asher
 * @Date:2021/3/9 08:35
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public interface Queue<E> {
    void enqueue(E e);

    int getSize();

    boolean isEmpty();

    E dequeue();

    E getFront();
}
