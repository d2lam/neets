class Solution {
    public boolean canJump(int[] nums) {

        if (nums.length - 1 == 0) return true;
        int cur = 0;

        while (cur < nums.length - 1) {
            if ( nums[cur] == 0 ) break;
            cur = cur + nums[cur];
            if (cur == nums.length - 1) return true;
        }

        return false;
    }
}
