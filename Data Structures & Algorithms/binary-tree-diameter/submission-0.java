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
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
    }
    public int getHeight(TreeNode node) {
        if (node == null) return 1;

        return Math.max(Math.max( getHeight(node.left), getHeight(node.right)) + 1, getHeight(node.left) + getHeight(node.right) );
    }
}
