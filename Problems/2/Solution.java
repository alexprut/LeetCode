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
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) { return l2; }
		if (l2 == null) { return l1; }
		int reminder = 0;
		ListNode head = l1;
		ListNode prevL1 = null;
		ListNode prevL2 = null;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				int val = l2.val + reminder;
				if (val >= 10) {
					val = val - 10;
					reminder = 1;
				} else {
					reminder = 0;
				}
				l1 = new ListNode(val);
				prevL1.next = l1;

				prevL1 = l1;
				l1 = l1.next;
				prevL2 = l2;
				l2 = l2.next;
			} else if (l2 == null) {
				int val = l1.val + reminder;
				if (val >= 10) {
					val = val - 10;
					reminder = 1;
				} else {
					reminder = 0;
				}
				l1.val = val;
				prevL1 = l1;
				l1 = l1.next;
			} else {
				// both not null
				int val = l1.val + l2.val + reminder;
				if (val >= 10) {
					val = val - 10;
					reminder = 1;
				} else {
					reminder = 0;
				}
				l1.val = val;
				prevL1 = l1;
				l1 = l1.next;
				prevL2 = l2;
				l2 = l2.next;
			}
		}

		if (reminder != 0) {
			l1 = new ListNode(reminder);
			prevL1.next = l1;
		}

		return head;
	}
}