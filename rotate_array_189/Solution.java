package rotate_array_189;

public class Solution {
    int[] localNums;

    public void rotate(int[] nums, int k) {
        localNums = nums;
        int shiftedIndex = k % nums.length;
        int lastIndex = nums.length - 1;
        reverseFragment(0, lastIndex);
        reverseFragment(0, shiftedIndex - 1);
        reverseFragment(shiftedIndex, lastIndex);
    }

    private void reverseFragment(int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int valueSaver = localNums[startIndex];
            localNums[startIndex] = localNums[endIndex];
            localNums[endIndex] = valueSaver;
            startIndex++;
            endIndex--;
        }
    }
}
