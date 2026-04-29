class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Arraylist<Integer>> res = new ArrayList<>();
        take(0, nums, new ArrayList<Integer>(), res)
        return res;
    }

    public void take(int pos, int[] nums, ArrayList<Integer> currentList, ArrayList<Arraylist<Integer>> res) {
        if (pos > nums.length - 1) {
            return;
        }

        currentList.add(nums[pos]);
        res.add(currentList.copy);


        take(pos+1, nums, currentList, res);

        currentList.remove(nums[pos]);
        take(pos+1, nums, currentList, res);

        return;
    }
}
