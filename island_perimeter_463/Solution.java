package island_perimeter_463;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int shoreCounter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (j == 0 || grid[i][j - 1] == 0) {
                        shoreCounter++;
                    }

                    if (i == 0 || grid[i - 1][j] == 0) {
                        shoreCounter++;
                    }

                    if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                        shoreCounter++;
                    }

                    if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                        shoreCounter++;
                    }
                }
            }
        }

        return shoreCounter;
    }
}