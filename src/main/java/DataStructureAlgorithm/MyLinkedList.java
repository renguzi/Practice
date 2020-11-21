package DataStructureAlgorithm;

/**
 * @Author:asher
 * @Date:2020/10/28 10:08
 * @Description:DataStructureAlgorithm
 * @Version:1.0
 */
public class MyLinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public boolean addToLast(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next= new_node;
        return true;
    }

    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is null");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public Integer findByKey(int d) {
        Node temp = head;
        //        如果链表为空，则返回null;
        if (temp == null) {
            System.out.println("LinkedList is null");
            return null;
        }
//        从链表头开始查找，如果链表存放的数据==d,则查到了，输出该元素，并返回该元素的数据
//        终止条件是链表的下一个元素指向NULL，表示没找到(即从第一个到倒数第二个元素里都没找到匹配元素)
        while (temp.next != null) {
            if (temp.data == d) {
                System.out.println(temp);
                return temp.data;
            }
            temp =temp.next;
        }
//        此种情况意味着，在链表的最后一个位置处找到了。
        if (temp.next == null && temp.data == d) {
            System.out.println(temp);
            return temp.data;
        }
//        最后，没找到的话，则返回NULL
        return null;
    }

    public void deleteByKey(int key) {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is empty");
        }

//        第一个元素就是要删的数据，则让head指向temp的下一个元素，相当于把第一元素删掉了。
        if (temp.data == key) {
            head = temp.next;
        }

        while (temp.next != null) {
            if (temp.data == key) {
                Node temp1=head;
                while (temp1.next.data == key) {
                    temp1.next = temp.next;
                    break;
                }
                temp1 = temp1.next;
            }
            head = temp.next;

        }
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.printList();
        myLinkedList.addToLast(000);
        myLinkedList.printList();
        System.out.println("==============");
        Node n1 = new Node(11);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        myLinkedList.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        System.out.println(myLinkedList.head);
        System.out.println(myLinkedList.head.next);
        System.out.println(n1.next);
        System.out.println(n2.next);
        System.out.println(n3.next);
        System.out.println(n3);
//        System.out.println("hello");
        myLinkedList.printList();

//        System.out.println("world");
        myLinkedList.addToLast(100);
        myLinkedList.addToLast(101);
        myLinkedList.printList();
        System.out.println(myLinkedList.findByKey(101));
        myLinkedList.printList();
    }
}
