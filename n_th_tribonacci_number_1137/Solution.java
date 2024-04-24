package n_th_tribonacci_number_1137;

public class Solution {
    public int tribonacci(int n) {
        int result = 0;

        int[] lastThreeOfSequence = new int[]{0, 1, 1};

        if (n <= 2) {
            result = lastThreeOfSequence[n];
        } else {
            while (n > 2) {
                result = lastThreeOfSequence[0] + lastThreeOfSequence[1] + lastThreeOfSequence[2];
                lastThreeOfSequence[0] = lastThreeOfSequence[1];
                lastThreeOfSequence[1] = lastThreeOfSequence[2];
                lastThreeOfSequence[2] = result;
                n--;
            }
        }

        return result;
    }
}