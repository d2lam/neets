class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, globalMax = nums[0];
        for (int n : nums) {
            currSum = Math.max(currSum, 0);
            currSum += n;
            globalMax = Math.max(currSum, globalMax);
        }

        return globalMax;
    }
}
