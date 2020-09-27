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
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		ArrayList<Integer> res = new ArrayList<>();
		res.addAll(inorderTraversal(root.left));
		res.add(root.val);
		res.addAll(inorderTraversal(root.right));
		return res;
	}
}