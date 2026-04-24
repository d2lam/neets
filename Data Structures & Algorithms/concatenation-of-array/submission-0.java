class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for (int i = 0 ; i < len; i++) {
            System.out.println(i + " " + (i+len-1));
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
}