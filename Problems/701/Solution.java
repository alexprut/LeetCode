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
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) { return new TreeNode(val); }
		insert(root, val);
		return root;
	}
	public void insert(TreeNode root, int val) {
		if (root.val > val) {
			// left
			if (root.left == null) {
				// add
				TreeNode tmp = new TreeNode(val);
				root.left = tmp;
			} else {
				insert(root.left, val);
			}
		} else {
			// right
			if (root.right == null) {
				TreeNode tmp = new TreeNode(val);
				root.right = tmp;
			} else {
				insert(root.right, val);
			}
		}
	}
}