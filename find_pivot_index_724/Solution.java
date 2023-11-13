package find_pivot_index_724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex;
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (pivotIndex = 0; pivotIndex < nums.length; pivotIndex++) {
            rightSum -= nums[pivotIndex];

            if (rightSum == leftSum) {
                return pivotIndex;
            } else {
                leftSum += nums[pivotIndex];
            }
        }

        return -1;
    }
}
