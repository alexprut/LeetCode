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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int i, int j) {
        // Base case
        if (i > j) { return null; }
        /**
         (0 + 0) / 2 = 0
         (0 + 1) / 2 = 0
         (1 + 1) / 2 = 1
         (0 + 2) / 2 = 1
         (0 + 3) / 2 = 1
         */
        int middle = (i + j) / 2;
        return new TreeNode(
                nums[middle],
                sortedArrayToBST(nums, i, middle - 1),
                sortedArrayToBST(nums, middle + 1, j)
        );
    }
}