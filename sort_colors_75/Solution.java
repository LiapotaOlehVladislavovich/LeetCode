package sort_colors_75;

public class Solution {
    public void sortColors(int[] nums) {
        int redPointer = 0;
        int bluePointer = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            while ((nums[i] == 0 && i > redPointer)
                    || (nums[i] == 2 && i < bluePointer)) {
                if (nums[i] == 0) {
                    nums[i] = nums[redPointer];
                    nums[redPointer] = 0;
                    redPointer++;
                } else {
                    nums[i] = nums[bluePointer];
                    nums[bluePointer] = 2;
                    bluePointer--;
                }
            }
        }
    }
}
