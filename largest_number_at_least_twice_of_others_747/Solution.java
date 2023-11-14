package largest_number_at_least_twice_of_others_747;

public class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int num : nums) {
            if (num * 2 > max && num != max) {
                maxIndex = -1;
                break;
            }
        }

        return maxIndex;
    }
}
