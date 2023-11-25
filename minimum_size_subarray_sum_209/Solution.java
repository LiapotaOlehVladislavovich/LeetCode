package minimum_size_subarray_sum_209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int leftPointer = 0;
        int sum = 0;

        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            sum += nums[rightPointer];

            while (sum >= target) {
                answer = Math.min(answer, rightPointer + 1 - leftPointer);
                sum -= nums[leftPointer++];
            }
        }
        return (answer != Integer.MAX_VALUE) ? answer : 0;
    }
}
