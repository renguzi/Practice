package DataStructureAlgorithm.LinkedList1;

/**
 * @Author:asher
 * @Date:2021/3/9 08:36
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public class LinkedListQueue<E> implements Queue<E> {
    private class Node{
        private E e;
        private Node next;

        public Node(E e) {
            this.e = e;
            next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head,tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public void enqueue(E e) {
        Node newNode = new Node(e);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (head == tail) {
            return null;
        }
        Node retNode = head;
        head = head.next;
        //把要删除的元素的下一个置为NULL，这样它就从我们的list中移除了
        retNode.next = null;
        //假定list中只有1个元素，head和tail都指向它。当我们把它出队之后，head此时就指向NULL了，这个时候，tail也应该指向NULL,而不再是依然指向出队的那个元素
        if (head == null) {
            tail = null;
        }
        size--;
        return retNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue head ");
        Node node = head;
        while (node != null) {
            stringBuilder.append(node+ "-->");
            node = node.next;
        }
//        for (Node node = head; node != null; node = node.next) {
//            stringBuilder.append(node + "->");
//        }
        stringBuilder.append(" NULL tail");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        System.out.println(linkedListQueue.getSize());
        for (int i = 0; i < 10; i++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);
            if (i % 3 == 2) {
                linkedListQueue.dequeue();
                System.out.println(linkedListQueue);
            }

        }
        System.out.println(linkedListQueue.getSize());
    }
}
