package sort_array_by_parity_905;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int nextEven = 0;
        int current = nums.length - 1;
        int variableForSwap;

        while (current > nextEven) {
            if (nums[current] % 2 == 0) {
                variableForSwap = nums[current];
                nums[current] = nums[nextEven];
                nums[nextEven] = variableForSwap;
                nextEven++;
            } else {
                current--;
            }
        }

        return nums;
    }
}
