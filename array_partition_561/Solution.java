package array_partition_561;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        int maximumPossibleSum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            maximumPossibleSum += nums[i];
        }

        return maximumPossibleSum;
    }
}
