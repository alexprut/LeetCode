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
	int sum = 0;
	public TreeNode bstToGst(TreeNode root) {
		if (root.right != null) {
			bstToGst(root.right);
		}
		root.val += sum;
		sum = root.val;
		if (root.left != null) {
			bstToGst(root.left);
		}
		return root;
	}
}