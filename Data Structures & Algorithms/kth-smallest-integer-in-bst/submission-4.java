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
    
    static int intRef = 0;

    public int kthSmallest(TreeNode root, int k) {
        return traverse(root, k);
    }

    public int traverse(TreeNode root, int k) {

        if (root == null || intRef >= k ) {
            return -1;
        }

        

        return traverse(root.left, k);
        intRef += 1;
        if (intRef == k) {
            return root.val;
        }
        return traverse(root.right, k);
    }
}
