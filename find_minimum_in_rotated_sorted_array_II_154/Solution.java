package find_minimum_in_rotated_sorted_array_II_154;

public class Solution {
    int[] nums;

    public int findMin(int[] nums) {
        this.nums = nums;
        return findBinaryMin(0, nums.length - 1);
    }

    private int findBinaryMin(int left, int right) {
        if (left == right || nums[left] < nums[right]) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        return Math.min(findBinaryMin(left, mid), findBinaryMin(mid + 1, right));
    }
}