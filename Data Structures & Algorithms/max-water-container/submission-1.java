class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int left = 0;
        int right = heights.length - 1;

        while ( left < right ) {
            maxArea = Math.max(maxArea, (right-left) * Math.max(height[left], height[right]));
            if ( height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
