package first_missing_positive_41;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int result = nums.length + 1;

        int[] inOrderArray = new int[nums.length];

        for (int n : nums) {
            if (n > 0 && n <= nums.length) {
                inOrderArray[n - 1] = n;
            }
        }

        for (int i = 0; i < inOrderArray.length; i++) {
            if (inOrderArray[i] != i + 1) {
                result = i + 1;
                i = inOrderArray.length;
            }
        }

        return result;
    }
}