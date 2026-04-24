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

    public int max(TreeNode node, int max) {
        if (node == null) return max;

        return Math.max(max(node.left, max+1), max(node.right, max+1));

    }
    public int maxDepth(TreeNode root) {
        return max(root, 0);
    }
}
