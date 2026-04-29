class Solution {
    public int maxProduct(int[] nums) {
        int currMin = 1;
        int currMax = 1;
        int res = nums[0];
        for (int n : nums) {
            if (n == 0) {
                currMin = 1;
                currMax = 1;
                continue;
            }
            int tmpMax = currMax;
            currMax = Math.max(Math.max(n * currMax, n * currMin) , n);
            currMin = Math.min(Math.min(n * tmpMax, n * currMin) , n);
            res = Math.max(res, currMax);
        }

        return res;
    }
}
