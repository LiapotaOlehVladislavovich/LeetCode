package height_сhecker_1051;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int answer = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                answer++;
            }
        }

        return answer;
    }
}
