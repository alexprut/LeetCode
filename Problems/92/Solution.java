/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 1->2->3->3.1->4->5
 |  |         |  |
 L  l         r  R
 c

 L 1->4
 R 3.1->3->2->5

 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode lL = null;
        ListNode rR = null;
        ListNode h = head;
        ListNode l = null;
        ListNode r = null;

        ListNode tmp = head;
        for (int i = 1; i <= right; i++) {
            if (i == left) {
                l = tmp;
            } else if (i < left) {
                lL = tmp;
            }
            if (i == right) {
                r = tmp;
                rR = tmp.next;
            }
            tmp = tmp.next;
        }

        if (lL != null) { lL.next = null; }
        r.next = null;
        while (l != null) {
            ListNode nextl = l.next;
            l.next = rR;
            rR = l;
            l = nextl;
        }
        if (lL == null) {
            return rR;
        }

        lL.next = rR;
        return h;
    }
}