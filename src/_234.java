import java.util.ArrayList;
import java.util.List;

import util.ListNode;

public class _234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        ListNode cur = head;
        while(cur !=null){
            vals.add(cur.val);
            cur= cur.next;
        }
        int i = 0;
        int j = vals.size()-1;
        while(i<j){
            if(!vals.get(i).equals(vals.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
