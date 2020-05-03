/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	ArrayList<TreeNode> c = new ArrayList<>();
	public TreeNode balanceBST(TreeNode root) {
		inOrder(root);
		return bst(0, c.size() - 1);
	}

	public TreeNode bst(int start, int end) {
		if (start > end) { return null; }
		int middle = (start + end) / 2;
		TreeNode root = c.get(middle);
		root.left = bst(start, middle - 1);
		root.right = bst(middle + 1, end);
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root == null) { return; }
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = null;
		root.right = null;
		inOrder(left);
		c.add(root);
		inOrder(right);
	}
}