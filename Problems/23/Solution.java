/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 Time complexity: O(nlogk)
 Space complexity: O(logk)

 Approach:
 Use MinHeap => at most k items at the time in the heap => O(k) => insert new element is O(logk)
 O(nlogk)

 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        ListNode head = null;
        ListNode pointer = null;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.add(lists[i]);
            }
        }
        int n = 0;
        while (q.size() > 0) {
            ListNode current = q.poll();
            if (n == 0) {
                head = current;
                pointer = head;
            } else {
                pointer.next = current;
                pointer = pointer.next;
            }
            if (current.next != null) { q.add(current.next); }
            n++;
        }
        if (pointer != null) {
            pointer.next = null;
        }

        return head;
    }
}