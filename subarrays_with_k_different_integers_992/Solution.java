package subarrays_with_k_different_integers_992;

public class Solution {
    int[] nums;

    public int subarraysWithKDistinct(int[] nums, int k) {
        this.nums = nums;
        return countAtMostK(k) - countAtMostK(k - 1);
    }

    private int countAtMostK(int k) {
        int[] possibleNumbers = new int[20000];
        int left = 0, right = 0, uniqueCounter = 0, subArrayCounter = 0;

        while (right < nums.length) {
            int newIndex = nums[right] - 1;
            possibleNumbers[newIndex]++;

            if (possibleNumbers[newIndex] == 1) {
                uniqueCounter++;
            }

            while (uniqueCounter > k) {
                int oldIndex = nums[left] - 1;
                possibleNumbers[oldIndex] --;

                if (possibleNumbers[oldIndex] == 0) {
                    uniqueCounter--;
                }

                left++;
            }

            subArrayCounter += 1 + right - left;

            right++;
        }

        return subArrayCounter;
    }
}