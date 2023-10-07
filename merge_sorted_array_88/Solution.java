package merge_sorted_array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int currentNums1Index = m - 1;
        int currentNums2Index = n - 1;
        int currentResultIndex = m + n - 1;

        while (currentNums1Index >= 0 && currentNums2Index >= 0) {
            if (nums1[currentNums1Index] >= nums2[currentNums2Index]) {
                nums1[currentResultIndex] = nums1[currentNums1Index];
                currentNums1Index--;
            } else {
                nums1[currentResultIndex] = nums2[currentNums2Index];
                currentNums2Index--;
            }
            currentResultIndex--;
        }

        while (currentNums2Index >= 0) {
            nums1[currentResultIndex] = nums2[currentNums2Index];
            currentNums2Index--;
            currentResultIndex--;
        }
    }
}
