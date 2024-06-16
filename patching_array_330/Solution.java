package patching_array_330;

public class Solution {
    public int minPatches(int[] nums, int n) {
        int patchesNumber = 0;
        long needToCover = 1;
        int currentIndex = 0;

        while (needToCover <= n) {
            if (currentIndex < nums.length && nums[currentIndex] <= needToCover) {
                needToCover += nums[currentIndex];
                currentIndex++;
            } else {
                patchesNumber++;
                needToCover += needToCover;
            }
        }

        return patchesNumber;
    }
}