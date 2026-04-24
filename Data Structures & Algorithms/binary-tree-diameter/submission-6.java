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
        // if (root == null) return 0;

        // int leftHeight = getHeight(root.left);
        // int rightHeight = getHeight(root.right);

        // int diameter = leftHeight + rightHeight;

        // int sub = Math.max(diameterOfBinaryTree(root.left), 
        //                 diameterOfBinaryTree(root.right));
        // return Math.max(diameter, sub);

        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    public int dfs(TreeNode root, int[] res) {
        if (root == null) return 0;

        int leftHeight = dfs(root.left, res);
        int rightHeight = dfs(root.right, res);

        res[0] = Math.max(res[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);


    }

    // public int getHeight(TreeNode node) {
    //     if (node == null) return 0;

    //     return Math.max( getHeight(node.left), getHeight(node.right)) + 1;
    // }
}
