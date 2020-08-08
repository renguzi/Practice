package DataStructureAlgorithm;


/**
 * @Author:asher
 * @Date:2020/8/5 10:05
 * @Description:DataStructureAlgorithm
 * @Version:1.0
 */
public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node curr_node = list.head;
        System.out.println("LinkedList:");
        while (curr_node != null) {
            System.out.println(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList = insert(linkedList, 1);
        linkedList = insert(linkedList, 22);
        linkedList = insert(linkedList, 5);
        linkedList = insert(linkedList, 7);
        printList(linkedList);

    }
}
