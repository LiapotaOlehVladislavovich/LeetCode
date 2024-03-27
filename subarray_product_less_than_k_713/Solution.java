package subarray_product_less_than_k_713;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum = 0;
        int product = 1;
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left++];
            }

            if (product < k) {
                sum += 1 + (right - left);
            }

            right++;
        }

        return sum;
    }
}