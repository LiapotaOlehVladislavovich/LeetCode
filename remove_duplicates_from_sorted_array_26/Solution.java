package remove_duplicates_from_sorted_array_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int nextValue = 0;

        for (int i = 0; i < k; i++) {
            nums[i] = nums[nextValue];
            nextValue++;

            while (nextValue < nums.length && nums[i] == nums[nextValue]) {
                nextValue++;
                k--;
            }
        }

        return k;
    }
}
