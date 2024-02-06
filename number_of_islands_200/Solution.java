package number_of_islands_200;

public class Solution {
    private char[][] grid;
    int m;
    int n;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int islands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                islands += (wonderLands(i, j)) ? 1 : 0;
            }
        }

        return islands;
    }

    private boolean wonderLands(int i, int j) {
         if (i < 0 || i >= m || j < 0 || j >= n) {
             return false;
         }

         char value = grid[i][j];

         if (value == '0' || value == 'v') {
             return false;
         }

         grid[i][j] = 'v';
         wonderLands(i - 1, j);
         wonderLands(i + 1, j);
         wonderLands(i, j - 1);
         wonderLands(i, j + 1);
         return true;
    }
}
