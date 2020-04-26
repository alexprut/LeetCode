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
	int i = 0;
	public TreeNode bstFromPreorder(int[] p) {
		return bst(p, Integer.MAX_VALUE);
	}

	public TreeNode bst(int[] p, int max) {
		if (i >= p.length || p[i] > max) { return null; }
		TreeNode root = new TreeNode(p[i++]);
		root.left = bst(p, root.val);
		root.right = bst(p, max);
		return root;
	}
}