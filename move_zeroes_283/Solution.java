package move_zeroes_283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int currentIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[currentIndex] = num;
                currentIndex++;
            }
        }

        for (; currentIndex < nums.length; currentIndex++) {
            nums[currentIndex] = 0;
        }
    }
}
