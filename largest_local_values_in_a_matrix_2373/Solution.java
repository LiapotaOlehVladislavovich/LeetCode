package largest_local_values_in_a_matrix_2373;

public class Solution {
    /**
     * Method finds the largest value in every contiguous 3 x 3 matrix in grid,
     * and puts it into an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
     * maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix
     * in grid centered around row i + 1 and column j + 1.
     *
     * @param grid n x n integer matrix grid
     * @return generated matrix
     * */
    public int[][] largestLocal(int[][] grid) {
        //save size of matrix
        int length = grid.length;
        //create result matrix
        int[][] maxLocal = new int[length - 2][length - 2];

        //for each 3x3 sliding window
        for (int i = 0; i < length - 2; i++) {
            for (int j = 0; j < length - 2; j++) {
                //create variable to save maximum
                int maximum = grid[i][j];

                //for each number in window
                for (int m = i; m <= i + 2; m++) {
                    for (int n = j; n <= j + 2; n++) {
                        //find maximum and put it into variable
                        maximum = Math.max(maximum, grid[m][n]);
                    }
                }

                //put maximum into result matrix
                maxLocal[i][j] = maximum;
            }
        }

        //return result matrix
        return maxLocal;
    }
}