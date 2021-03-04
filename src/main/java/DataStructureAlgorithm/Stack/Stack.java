package DataStructureAlgorithm.Stack;

/**
 * @Author:asher
 * @Date:2021/2/23 12:03
 * @Description:DataStructureAlgorithm.Stack
 * @Version:1.0
 */
public interface Stack<E> {
    int getSize();

    int getCapacity();

    E peek();

    void push(E e);

    E pop();

    boolean isEmpty();


}
