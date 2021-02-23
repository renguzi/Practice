package DataStructureAlgorithm.Stack;

import DataStructureAlgorithm.Array.Array;

/**
 * @Author:asher
 * @Date:2021/2/23 12:25
 * @Description:DataStructureAlgorithm.Stack
 * @Version:1.0
 */
public class ArrayStack<E> implements Stack {
    private Array<E> arr;
    private int size;

    public ArrayStack(int n) {
        arr = new Array<E>(n);
        size=0;
    }

    public ArrayStack() {
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCapacity() {
        return arr.getCapacity();
    }

    @Override
    public E pop(){
        size--;
        return arr.removeLast();
    }

    @Override
    public E peek() {
        return arr.get(size - 1);
    }

    @Override
    public void push(Object e) {
        arr.addLast((E) e);
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.getSize(); i++) {
            stringBuilder.append(arr.get(i));
            if (i != arr.getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("] top");

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack(5);

        System.out.println(arrayStack.getCapacity());
        System.out.println(arrayStack.getSize());
        arrayStack.push(1);
        System.out.println(arrayStack);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);



        System.out.println(arrayStack);

        arrayStack.push(6);
        System.out.println(arrayStack);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack);

        System.out.println(arrayStack.getCapacity());
        System.out.println(arrayStack.getSize());


        System.out.println("pop...");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);
    }

}
