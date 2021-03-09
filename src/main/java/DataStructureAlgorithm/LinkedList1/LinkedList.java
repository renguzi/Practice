package DataStructureAlgorithm.LinkedList1;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author:asher
 * @Date:2021/3/7 18:21
 * @Description:DataStructureAlgorithm.LinkedList
 * @Version:1.0
 */
public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        public String toString() {
            return e.toString();
        }
    }

    //head指向链表的第1个元素
//    private Node head;
    //虚拟头结点，指向第1个结点的节点，
    private Node dummyHead;
    private int size;

    public LinkedList() {
        //初始化构造空链表时，指向第一个元素的head其实是指向NULL的
        dummyHead = new Node(null, null);
        size = 0;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //返回链表长度
    public int getSize() {
        return size;
    }


    //在链表中索引为index的位置处添加元素
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed.Illegal index.");
        } else {
            Node prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    //在链表头部添加元素
    public void addFirst(E e) {
        add(e, 0);
    }

    //在链表的尾部添加元素
    public void addLast(E e) {
        add(e, size);
    }

    //获取链表的第index个位置处的元素
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed.index is illegal");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        return prev.next.e;
    }

    //获取链表第1个元素
    public E getFirst() {
        return get(0);
    }

    //获取链表最后1个元素
    public E getLast() {
        return get(size-1);
    }

    //更新第index个位置处的元素
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("set failed. index illegal");
        } else {
            Node prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            prev.next.e = e;

            /*
            Node curr=dummyHead.next;
            for(int i=0;i<index;i++){
                curr=curr.next;
             }
             curr.e=e;
             */
        }
    }

    //判断链表中是否包含元素e?
    public boolean contains(E e) {
        //从第1个位置处开始找，即dummyHead.next位置开始，
//        Node curr = dummyHead.next;
//        while (curr != null) {
//            if (curr.e.equals(e)) {
//                return true;
//            }
//            curr = curr.next;
//        }
//        return false;

        if (isEmpty()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (get(i).equals(e)) {
                return true;
            }
        }
        return false;
    }
//删除索引下标为index的元素
    public E delete(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("delete failed.index illegal");
        }

        //prev用于记录要删除位置处的前一个索引位置的节点
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        //del表示要删除的节点
        Node del = prev.next;
        //让前一个的下一个，指向要删除的下一个，就把index位置处的元素给删除了
        prev.next = del.next;
        del.next = null;
        size--;
        return del.e;
    }

    public E deleteFirst() {
       return delete(0);
    }

    public E deleteLast() {
        return delete(size - 1);
    }

    public void removeElements(E e) {
        Node node= dummyHead.next;
        for (; node.next != null; node = node.next) {
            if (node.e.equals(e)) {
                if (node.next != null) {
                    Node delNode = node.next;
                    node.next = delNode.next;
                    delNode.next = null;
                } else {
                    node.next = null;
                }
            }
        }
    }

    public void deleteElement(E e) {
        if (isEmpty() || !contains(e)) {
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (get(i).equals(e)) {
//                list.add(i);
                delete(i);
//                size++;
//                break;
//                continue;
            }
        }
        System.out.println(list);
        Collections.reverse(list);

//        for (int i = list.size()-1; i >0 ; i--) {
//            delete(list.get(i));
//        }
        for (Integer k:list ) {
//            delete(k);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        //第一种循环方式
//        Node curr = dummyHead.next;
//        while (curr != null) {
//            stringBuilder.append(curr + "->");
//            curr = curr.next;
//        }
//        stringBuilder.append("NULL");

       //第2种循环方式
        for (Node curr = dummyHead.next; curr != null; curr = curr.next) {
            stringBuilder.append(curr + "->");
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(100);
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getSize());

        linkedList.addFirst(101);
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList1.addFirst(i);
            System.out.println(linkedList1);
        }

        System.out.println(linkedList1.contains(555));
        linkedList1.add(555, 3);
        System.out.println(linkedList1);

        System.out.println(linkedList1.contains(555));

//        linkedList1.delete(54);
        linkedList1.deleteLast();
        linkedList1.add(555, 4);
        System.out.println(linkedList1);
        linkedList1.addFirst(555);
        System.out.println(linkedList1);
//        linkedList1.deleteElement(555);
        linkedList1.removeElements(555);
        System.out.println(linkedList1);
    }

}
