import java.util.*;

import util.ListNode;


public class _160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //数学逻辑题了

        if(headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            pA = pA == null?headB : pA.next;
            pB = pB == null?headA : pB.next;
        }
        return pA;
    }
}
