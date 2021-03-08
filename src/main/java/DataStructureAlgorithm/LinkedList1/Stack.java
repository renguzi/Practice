package DataStructureAlgorithm.LinkedList1;

/**
 * @Author:asher
 * @Date:2021/3/8 14:50
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public interface Stack<E> {

    void push(E e);

    E peek();

    E pop();

    boolean isEmpty();

    int getSize();

}
