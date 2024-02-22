package search_a_2D_matrix_II_240;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            int value = matrix[i][j];

            if (value == target) {
                result = true;
                i = matrix.length;
            } else if (value > target) {
                j--;
            } else {
                i++;
            }
        }

        return result;
    }
}