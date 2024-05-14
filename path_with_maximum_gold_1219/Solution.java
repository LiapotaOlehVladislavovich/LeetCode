package path_with_maximum_gold_1219;

public class Solution {
    private int[][] grid;
    private int m;
    private int n;

    /**
     * Method gets the grid and traverse it to find maximum amount of gold by rules:
     * -Every time you are located in a cell you will collect all the gold in that cell.
     * -From your position, you can walk one step to the left, right, up, or down.
     * -You can't visit the same cell more than once.
     * -Never visit a cell with 0 gold.
     * -You can start and stop collecting gold from any position in the grid that has some gold.
     *
     * @param grid of size m x n,
     *             each cell in this mine has an integer representing the amount of gold in that cell,
     *             0 if it is empty.
     * @return maximum amount of gold you can collect
     * */
    public int getMaximumGold(int[][] grid) {
        //create global variables for grid and it`s size
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;

        //create variable for best result
        int bestPass = 0;

        //for each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //set maximal value into best result
                bestPass = Math.max(bestPass, countBestPass(i, j));
            }
        }

        //return best result
        return bestPass;
    }

    private int countBestPass(int i, int j) {
        //if reached empty cell or left the grid
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            //return 0
            return 0;
        }

        //save current value
        int currentValue = grid[i][j];
        //set current grid cell as 0, to represent it as visited
        grid[i][j] = 0;
        //create variable to store best pass from here
        int bestValue = 0;
        //travel in each direction and find the best value
        bestValue = Math.max(bestValue, countBestPass(i + 1, j));
        bestValue = Math.max(bestValue, countBestPass(i - 1, j));
        bestValue = Math.max(bestValue, countBestPass(i, j + 1));
        bestValue = Math.max(bestValue, countBestPass(i, j - 1));
        //set back value of current cell
        grid[i][j] = currentValue;
        // return current cell value summed with best pass
        return currentValue + bestValue;
    }
}