class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        // take(0, nums, new ArrayList<Integer>(), res);
        // return res;

        for (int num : nums) {
            int size = res.size();
            for ( int i = 0 i < size; i++) {
                List<Integer> sub = new ArrayList<>(res.get(j));
                sub.add(num);
                res.add(sib);
            }
        }

        return res;
    }

    public void take(int pos, int[] nums, ArrayList<Integer> currentList, List<List<Integer>> res) {
        if (pos > nums.length - 1) {
            return;
        }

        currentList.add(nums[pos]);
        res.add(new ArrayList<>(currentList));


        take(pos+1, nums, currentList, res);

        currentList.remove(currentList.size() - 1);
        take(pos+1, nums, currentList, res);

        return;
    }
}