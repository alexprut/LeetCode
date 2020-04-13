/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public int sumEvenGrandparent(TreeNode root) {
		int sum = 0;
		if (root == null) { return sum; }
		// even-valued grandparent
		if (root.val % 2 == 0) {
			if (root.left != null) {
				if (root.left.left != null) { sum += root.left.left.val; }
				if (root.left.right != null) { sum += root.left.right.val; }
			}
			if (root.right != null) {
				if (root.right.left != null) { sum += root.right.left.val; }
				if (root.right.right != null) { sum += root.right.right.val; }
			}
		}
		return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
	}
}