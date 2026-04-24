class Solution {
    public int maxSubArray(int[] nums) {
        // 2 pointers, sliding window 
        int maxSum = nums[0];
        int currSum = 0;
        int maxL = 0, maxR = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (currSum < 0) {
                currSum = 0;
                left = right;
            }

            currSum += nums[right];
            if (currSum > maxSum) {
                maxSum = currSum;
                maxL = left;
                maxR = right;
            }
        }

        return maxSum;
    }
}
