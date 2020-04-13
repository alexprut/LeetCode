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
	public int deepestLeavesSum(TreeNode root) {
		int depth = d(root);
		return sum(root, 1, depth);
	}

	public int sum(TreeNode root, int cd, int d) {
		if (root == null) { return 0; }
		if (cd == d) { return root.val; }
		return sum(root.left, cd + 1, d) + sum(root.right, cd + 1, d);
	}

	public int d(TreeNode root) {
		if (root == null) { return 0; }
		if (root.left == null && root.right == null) { return 1; }
		if (root.left == null && root.right != null) { return d(root.right) + 1; }
		if (root.right == null && root.left != null) { return d(root.left) + 1; }
		return Math.max(d(root.right), d(root.left)) + 1;
	}
}