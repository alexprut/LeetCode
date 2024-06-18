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
 Time Complexity: O(n)
 Space Complexity; O(n)
 */
class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        visit(root, 0);
        return sum;
    }

    public void visit(TreeNode node, int acc) {
        if (node.left == null && node.right == null) {
            acc *= 10;
            acc += node.val;
            sum += acc;
        } else {
            if (node.left != null) {
                int tmp = acc;
                tmp *= 10;
                tmp += node.val;
                visit(node.left, tmp);
            }
            if (node.right != null) {
                int tmp = acc;
                tmp *= 10;
                tmp += node.val;
                visit(node.right, tmp);
            }
        }
    }
}