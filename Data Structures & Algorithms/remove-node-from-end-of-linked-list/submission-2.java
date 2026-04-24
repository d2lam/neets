/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public class RefInt {
        int val;
        public RefInt(int x) {
            val = x;
        }
    }

    public ListNode rec(ListNode head, RefInt refInt) {
        if (head == null) {
            return null;
        }

        head.next = rec(head.next, refInt);
        refInt.val-=1;
        if (refInt.val == 0) return head.next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        return rec(head, new RefInt(n));
    }
}
