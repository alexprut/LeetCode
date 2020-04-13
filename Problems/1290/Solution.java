/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public int getDecimalValue(ListNode head) {
		String num = "";
		while (head != null) {
			num += String.valueOf(head.val);
			head = head.next;
		}
		return Integer.parseInt(num, 2);
	}
}