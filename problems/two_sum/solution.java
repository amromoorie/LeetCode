class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // current iterating value
            int current = nums[i];
            // complementary value of current iterating value
            int complement = target - current;
            // if lookup map has the complementValue;
            // return the 2 indexes that adds up to target
            if (lookup.containsKey(complement)) {
                return new int[] { i, lookup.get(complement) };
            }
            // sets current iterating value for tracking
            lookup.put(current, i);
        }
        throw new IllegalArgumentException("no matching values found!");
    }
}