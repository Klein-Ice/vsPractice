import util.ListNode;
import java.util.*;

public class _141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;

            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycle2(ListNode head){
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
