package DataStructureAlgorithm.LinkedList1;

import DataStructureAlgorithm.Stack.ArrayStack;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:asher
 * @Date:2021/3/8 14:51
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    LinkedListStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.deleteFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Stack:");
        stringBuilder.append(linkedList.toString());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        for (int i = 0; i < 10; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
            if (i % 3 == 2) {
                linkedListStack.pop();
                System.out.println(linkedListStack);
            }
        }



        Random random=new Random();
        int count = 1000000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedListStack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < count; i++) {
            linkedListStack.pop();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("LinkedListStack: time: " + (t2 - t1) / 1000.0);

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayStack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < count; i++) {
            arrayStack.pop();
        }
        long t4 = System.currentTimeMillis();
        System.out.println("ArrayStack: time: " + (t4 - t3) / 1000.0);

    }

}
