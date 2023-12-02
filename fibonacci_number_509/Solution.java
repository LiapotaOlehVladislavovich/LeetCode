package fibonacci_number_509;

public class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fn = new int[n + 1];
        fn[0] = 0;
        fn[1] = 1;

        for (int i = 2; i<=n; i++) {
            fn[i] = fn[i - 1] + fn[i - 2];
        }

        return fn[n];
    }
}
