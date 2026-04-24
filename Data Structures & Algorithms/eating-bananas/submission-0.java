class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxK = 0;
        for (int p : piles) {
            maxK = Math.max(maxK, p);
        }
        int l = 1;
        int r = maxK;

        int minK = maxK;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (canFinish(piles, h, mid)) {
                minK = mid;
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return minK;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int count = 0;
        for (int p : piles) {
            count += Math.ceil((double) p / k);        
        }
        return count <= h;
    }
}