class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> fruitMap = new HashMap<>(); // fruit -> countInBasket
        // sliding window
        int res = 0;
        int left = 0;

        for (int right = 0 ; right < fruits.length; right++) {
            int fruit = fruits[right];

            fruitMap.put(fruit, fruitMap.getOrDefault(fruit, 0) + 1);

            while (fruitMap.size() > 2) {
                int leftFruit = fruits[left];
                int count = fruitMap.get(leftFruit) - 1;
                if (count == 0) {
                    fruitMap.remove(leftFruit);
                } else {
                    fruitMap.put(leftFruit, count);
                }
                
                left++;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}