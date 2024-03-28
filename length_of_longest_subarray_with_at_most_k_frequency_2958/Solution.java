package length_of_longest_subarray_with_at_most_k_frequency_2958;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        while (right < nums.length) {
            if (!frequency.containsKey(nums[right])) {
                frequency.put(nums[right], 1);
            } else {
                frequency.put(nums[right], frequency.get(nums[right]) + 1);
            }

            if (frequency.get(nums[right]) > k) {
                result = Math.max(result, right - left);

                while (frequency.get(nums[right]) > k) {
                    frequency.put(nums[left], frequency.get(nums[left]) - 1);
                    left++;
                }
            }

            right++;
        }

        return Math.max(result, right - left);
    }
}