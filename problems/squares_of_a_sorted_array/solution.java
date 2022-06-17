class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int pos = n - 1;
        int start = 0;
        int end = n - 1;

        while (end >= start) {
            int startValue = Math.abs(nums[start] * nums[start]);
            int endValue = Math.abs(nums[end] * nums[end]);

            if (endValue >= startValue) {
                result[pos] = endValue;
                end--;
            } else {
                result[pos] = startValue;
                start++;
            }
            pos--;
        }
        return result;
    }
}