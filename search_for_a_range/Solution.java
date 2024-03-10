package search_for_a_range;

public class Solution {
    private int[] nums;
    int target;

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        this.nums = nums;
        this.target = target;
        return searchInSubArray(0, nums.length - 1);
    }

    private int[] searchInSubArray(int left, int right) {
        if (nums[left] == target && nums[right] == target) {
            return new int[]{left, right};
        }

        if (left + 1 == right || left == right) {
            if (nums[left] == target) {
                return new int[]{left, left};
            }

            if (nums[right] == target) {
                return new int[]{right, right};
            }

            return new int[]{-1, -1};
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] > target) {
            return searchInSubArray(left, mid);
        }

        if (nums[mid] < target) {
            return searchInSubArray(mid, right);
        }

        int[] leftSubArray = searchInSubArray(left, mid);
        int[] rightSubArray = searchInSubArray(mid, right);

        if (leftSubArray[0] == -1) {
            return rightSubArray;
        }

        if (rightSubArray[0] == -1) {
            return leftSubArray;
        }

        return new int[]{leftSubArray[0], rightSubArray[1]};
    }
}