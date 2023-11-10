/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *

 Time Complexity: O(n)
 Space Complexity: O(n)
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) { // 0->1->2, 4
        int size = 0;
        ListNode tmp = head; // 0
        ListNode tail = head; // 0
        while (tmp != null) { // 0,1,2
            size++; // 1,2,3
            if (tmp.next == null) { tail = tmp; } // 2
            tmp = tmp.next; // 1,2
        }
        if (size == 0) {
            return head;
        }

        int shifts = k % size; // 4%3=1
        if (shifts == 0) {
            return head;
        }
        ListNode cut = head; // 0
        int i = size - shifts - 1; // 3-1=2
        while (i > 0) { // 2,1
            cut = cut.next; // 1,2
            i--; // 1
        }

        ListNode nextHead = cut.next;
        cut.next = null;
        tail.next = head;
        head = nextHead;

        return head;
    }
}