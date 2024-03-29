package count_subarry_where_max_element_appears_at_least_k_times_2962;

public class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max = 0;

        for (int n : nums) {
            max = Math.max(max, n);
        }

        long left = 0, right = 0, subArrayCounter = 0, repeaterCounter = 0;

        while (right < nums.length) {
            if (nums[(int)right] == max) {
                repeaterCounter++;
            }

            while (repeaterCounter >= k) {
                subArrayCounter += nums.length - right;

                if (nums[(int)left] == max) {
                    repeaterCounter--;
                }

                left++;
            }

            right++;
        }

        return subArrayCounter;
    }
}