package sqrt_x_69;

public class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square > x) {
                right = mid - 1;
            } else if (square == x) {
                return mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}