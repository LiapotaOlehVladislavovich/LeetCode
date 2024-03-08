package find_peak_element_162;

public class Solution {
    int[] nums;
    int lastIndex;

    public int findPeakElement(int[] nums) {
        this.nums = nums;
        lastIndex = nums.length - 1;
        return findLocalPeak(0, lastIndex);
    }

    private int findLocalPeak(int leftIndex, int rightIndex) {
        int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

        if (midIndex == 0 || nums[midIndex] > nums[midIndex - 1]) {
            if (midIndex == lastIndex || nums[midIndex] > nums[midIndex + 1]) {
                return midIndex;
            } else {
                return findLocalPeak(midIndex + 1, rightIndex);
            }
        } else {
            return findLocalPeak(leftIndex, midIndex - 1);
        }
    }
}