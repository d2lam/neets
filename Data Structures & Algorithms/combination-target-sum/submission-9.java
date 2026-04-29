class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        dfs(nums, 0, target, res, new ArrayList<>());

        return res;
    }

    public void dfs(int nums[], int pos, int target, List<List<Integer>> res, List<Integer> curr) {
        if (pos > nums.length - 1 || target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<Integer>(curr));
            return;
        }

    

        curr.add(nums[pos]);

        dfs(nums, pos, target - nums[pos], res, curr);
        curr.remove(curr.size() - 1);
        dfs(nums, pos+1, target, res, curr);
    
    }
}
