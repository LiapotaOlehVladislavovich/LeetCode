package binary_search_704;

public class Solution {
    int[] nums;
    int target;

    public int search(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        return searchInHalf(0, nums.length - 1);
    }

    private int searchInHalf(int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (nums[middle] == target) {
            return middle;
        }

        if (nums[middle] < target) {
            return searchInHalf(middle + 1, right);
        }

        return searchInHalf(left, middle - 1);
    }
}
