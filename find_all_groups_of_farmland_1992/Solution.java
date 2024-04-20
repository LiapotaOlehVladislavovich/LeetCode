package find_all_groups_of_farmland_1992;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    int[] coordinates = new int[4];
                    coordinates[0] = i;
                    coordinates[1] = j;

                    int m = i;
                    int n = j;

                    while (n < land[m].length && land[m][n] == 1) {
                        land[m][n] = 0;
                        n++;
                    }
                    m++;

                    while (m < land.length && land[m][n - 1] == 1) {
                        for (int k = j; k < n; k++) {
                            land[m][k] = 0;
                        }
                        m++;
                    }

                    coordinates[2] = m - 1;
                    coordinates[3] = n - 1;
                    result.add(coordinates);

                    j = n;
                }
            }
        }

        return result.toArray(new int[result.size()][4]);
    }
}