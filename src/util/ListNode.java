package util;

import java.util.*;

public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
        public ListNode(ListNode node){
            next = node;
        }
        public ListNode(){}
}
