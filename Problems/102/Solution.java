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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        visit(res, root, 1);

        return res;
    }

    private void visit(List<List<Integer>> res, TreeNode root, int level) {
        if (root == null) { return; }
        if (res.size() < level) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level - 1).add(root.val);
        if (root.left != null) {
            visit(res, root.left, level + 1);
        }
        if (root.right != null) {
            visit(res, root.right, level + 1);
        }
    }
}