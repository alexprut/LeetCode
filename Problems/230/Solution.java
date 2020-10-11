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
	public int kthSmallest(TreeNode root, int k) {
		TreeNode node = root;
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (!stack.empty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				node = stack.pop();
				result.add(node.val);
				if (result.size() == k) {
					return result.get(k - 1);
				}
				node = node.right;
			}
		}
		return -1;
	}
}