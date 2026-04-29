class Solution {
    public boolean canJump(int[] nums) {

        if (nums.length - 1 == 0) return true;
        int cur = 0;

        while (cur < nums.length - 1) {
            if ( nums[cur] == 0 ) break;
            int maxDistance = -1;

            for (i=1; i <= nums[cur]; i++) {
                maxDistance= Math.max(maxDistance, nums[cur] - i);
            }

            cur = cur + maxDistance;
            if (cur > nums.length - 1) return true;
        }

        return false;
    }
}
