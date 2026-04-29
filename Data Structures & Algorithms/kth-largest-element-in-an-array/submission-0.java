class Solution {
    public int findKthLargest(int[] nums, int k) {
        

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);

        for( int n: nums) {
            if (n < queue.peek()) {
                queue.add(n);
            }
        }

        return queue.peek();

    }
}
