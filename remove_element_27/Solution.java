package remove_element_27;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int numsCurrentIndex = 0;
        int[] numsCopy = Arrays.copyOf(nums, k);

        for (int j : numsCopy) {
            if (j == val) {
                k--;
            } else {
                nums[numsCurrentIndex] = j;
                numsCurrentIndex++;
            }
        }

        return k;
    }
}
