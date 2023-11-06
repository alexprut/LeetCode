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
    public ListNode mergeNodes(ListNode head) {
        if (head == null || head.next == null) { return null; }
        // Invariant: head.val == 0
        head = head.next;
        int sum = 0;
        while (head.val != 0) {
            sum += head.val;
            head = head.next;
        }
        return new ListNode(sum, mergeNodes(head));
    }
}