/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }


 Time complexity: O(n)
 Space complexity: O(n)
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int max = 0;
        ListNode c = head;
        while (c != null) {
            tmp.add(c.val);
            c = c.next;
        }
        for (int i = 0; i < tmp.size() / 2; i++) {
            max = (max > tmp.get(i) + tmp.get(tmp.size() - i - 1)) ? max : tmp.get(i) + tmp.get(tmp.size() - i - 1);
        }

        return max;
    }
}