class Solution {

    public int reverse(int x) {
        String numberStringified = Integer.toString(Math.abs(x));
        StringBuilder numberReversed = new StringBuilder(numberStringified).reverse();
        try {
            int sign = x > 0 ? 1 : -1;
            String numberStringifiedReversed = numberReversed.toString();
           
            return Integer.parseInt(numberStringifiedReversed) * sign;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}