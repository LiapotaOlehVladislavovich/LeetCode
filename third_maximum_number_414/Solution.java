package third_maximum_number_414;

public class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (firstMax == num || secondMax == num || thirdMax == num) {
                continue;
            }
            if (firstMax <= num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            else if (secondMax <= num) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if (thirdMax <= num) {
                thirdMax = num;
            }
        }

        if (thirdMax == Long.MIN_VALUE) {
            return (int) firstMax;
        }

        return (int) thirdMax;
    }
}
