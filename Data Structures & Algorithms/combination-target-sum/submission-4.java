class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        
    }

    public void dfs(int nums[], int pos, int target, List<List<Integer>> res, List<Integer> curr) {
        if (pos > nums.length - 1 || target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<curr>());
            return;
        }

    

        curr.add(nums[pos]);

        dfs(nums, pos, target - nums[pos], res, curr);
        cur.remove(curr.size() - 1);
        dfs(nums, pos+1, target, res, curr);
    
    }
}
