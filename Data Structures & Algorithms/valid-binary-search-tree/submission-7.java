class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        
        int val = root.val;

        if (!(min != null && val > min
            && max != null && max > val
        )) return false;
        
        return validate(root.left, min, val) && validate(root.right, val, max);
        
    }
}