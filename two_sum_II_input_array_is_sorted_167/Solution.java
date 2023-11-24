package two_sum_II_input_array_is_sorted_167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[]{0, numbers.length - 1};
        int sum = numbers[result[0]] + numbers[result[1]];

        while (sum != target) {
            if (sum < target) {
                result[0]++;
            } else {
                result[1]--;
            }

            sum = numbers[result[0]] + numbers[result[1]];
        }

        result[0]++;
        result[1]++;

        return result;
    }
}
