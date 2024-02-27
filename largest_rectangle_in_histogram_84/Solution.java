package largest_rectangle_in_histogram_84;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int answer = 0;
        int[] leftBorders = new int[heights.length];
        int[] rightBorders = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            int r = i + 1;

            while (r < heights.length && heights[r] >= heights[i]) {
                r = rightBorders[r];
            }
            rightBorders[i] = r;
        }

        for (int i = 0; i < heights.length; i++) {
            int l = i - 1;

            while (l >= 0 && heights[l] >= heights[i]) {
                l = leftBorders[l];
            }

            leftBorders[i] = l;

            answer = Math.max(answer, heights[i] * (rightBorders[i] - leftBorders[i] - 1));
        }

        return answer;
    }
}