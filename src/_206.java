import util.ListNode;

public class _206 {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode cur = head;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = dummy;
            dummy = cur;
            cur = temp;
        }
        return dummy;

    }
}
