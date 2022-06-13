class Solution {
    public int reverse(int x) {
        int sign = x > 0 ? 1 : -1;
        
        String numberStringified = Integer.toString(Math.abs(x));
        StringBuilder numberReversed = new StringBuilder(numberStringified).reverse();
        String numberStringifiedReversed = numberReversed.toString();

        try {
            return Integer.parseInt(numberStringifiedReversed) * sign;
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}