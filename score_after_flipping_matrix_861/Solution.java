package score_after_flipping_matrix_861;

public class Solution {
    /**
     * Methods get`s a matrix
     *
     * @param grid m x n binary matrix filled with 1 and 0
     * @return maximal possible value
     * */
    public int matrixScore(int[][] grid) {
        //save sizes of matrix
        int m = grid.length;
        int n = grid[0].length;

        //for each row
        for (int i = 0; i < m; i++) {
            //if first bit is equal 0
            if (grid[i][0] == 0) {
                //reverse row
                for (int j = 0; j < n; j++) {
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }

        //for each column
        for (int j = 1; j < n; j++) {
            //set counters
            int zeroCounter = 0;
            int oneCounter = 0;

            //count zeroes and ones
            for (int[] g : grid) {
                if (g[j] == 1) {
                    oneCounter++;
                } else {
                    zeroCounter++;
                }
            }

            //if there are more zeroes than ones
            if (zeroCounter > oneCounter) {
                //reverse column
                for (int i = 0; i < m; i++) {
                    grid[i][j] = (grid[i][j] == 0) ? 1 : 0;
                }
            }
        }

        //set score
        int score = 0;

        //for each row
        for (int[] g : grid) {
            //set number
            int currentNumber = 0;
            //for each cell
            for (int j = 0; j < n; j++) {
                //set decimal equivalent
                if (g[j] == 1) {
                    currentNumber += (int) Math.pow(2, n - 1 - j);
                }
            }
            //increase score
            score += currentNumber;
        }

        //return score
        return score;
    }
}