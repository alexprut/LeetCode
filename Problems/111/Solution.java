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

    public int minDepth(TreeNode root) {
        return recMinDepth(root, 0);
    }

    public int recMinDepth(TreeNode root, int v) {
        if (root == null) { return 0; }

        v++;

        if (root.left == null && root.right == null) { return v; }

        if (root.left != null && root.right != null) {
            int left = recMinDepth(root.left, v);
            int right = recMinDepth(root.right, v);

            return left < right ? left : right;
        }

        return (root.left != null) ? recMinDepth(root.left, v) : recMinDepth(root.right, v);
    }
}