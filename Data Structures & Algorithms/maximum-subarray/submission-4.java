class Solution {
    public int maxSubArray(int[] nums) {
        // int[] minPtrs = findMinSubArray(nums);
        // l = minPts[0];
        // lr = minPts[1];

        int maxSum = nums[0];
        int curSum = 0;

        for ( int num : nums) {
            curSum += num;
            if (curSum < 0) curSum = 0;
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }

//     private int[] findMinSubArray(nums) {
//  // 2 pointers, sliding window 
//         int minSum = nums[0];
//         int currSum = 0;
//         int minL = 0, minR = 0;
//         int left = 0;

//         for (int right = 0; right < nums.length; right++) {
//             currSum += nums[right];
//             if (currSum > maxSum) {
//                 maxSum = currSum;
//                 maxL = left;
//                 maxR = right;
//             }
//         }

//         return new int[]{maxL, maxR};
//     }
}
