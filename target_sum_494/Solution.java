package target_sum_494;

public class Solution {
    int[] nums;
    int target;

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        return countWay(0, 0);
    }

    private int countWay(int index, int currentSum) {
        if (index == nums.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        return countWay(index + 1, currentSum + nums[index])
                + countWay(index + 1, currentSum - nums[index]);
    }
}
