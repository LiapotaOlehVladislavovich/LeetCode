package valid_perfect_square_367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        boolean result = false;
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                result = true;
                left = right + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
