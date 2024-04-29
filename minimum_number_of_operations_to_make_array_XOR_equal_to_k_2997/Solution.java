package minimum_number_of_operations_to_make_array_XOR_equal_to_k_2997;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int finalXOR = 0;

        for (int n : nums) {
            finalXOR ^= n;
        }

        return Integer.bitCount(finalXOR ^ k);
    }
}