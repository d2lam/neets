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
    public boolean isValidBST(TreeNode root) {
        
        TreeNode l = root.left;
        TreeNode r = root.right;

        if ((l != null && root.val > l.val) &&
           (r != null && root.val < r.val) &&
            isValidBST(root.left) &&
            isValidBST(root.right)
            )
            return true;
    }
}
