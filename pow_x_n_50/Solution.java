package pow_x_n_50;

public class Solution {
    public double myPow(double x, int n) {
        if (n < 1) {
            n = -n;
            x = 1 / x;
        }

        return pow(x, n, 1);
    }

    public double pow(double x, int n, double result) {
        if (n == 0) {
            return result;
        }

        if ((n & 1) != 0) {
            result *= x;
        }

        x *= x;
        n >>>= 1;

        return pow(x, n, result);
    }
}

