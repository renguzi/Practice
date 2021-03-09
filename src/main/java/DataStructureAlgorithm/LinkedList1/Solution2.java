package DataStructureAlgorithm.LinkedList1;

/**
 * @Author:asher
 * @Date:2021/3/9 15:18
 * @Description:DataStructureAlgorithm.LinkedList1
 * @Version:1.0
 */
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode resNode = removeElements(head.next, val);
        if (head == null) {
            return resNode;
        } else {
            head.next = resNode;
            return head;
        }
    }

}
