class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int n : nums ) {
            if (map.isEmpty()) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey()).reversed();

        int[] res = new int[k];
        for ( int i; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

    }
}
