package spiral_matrix_54;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new LinkedList<>();

        int rowStart = 0;
        int rowEnd = matrix[0].length - 1;
        int columnStart = 0;
        int columnEnd = matrix.length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int j = rowStart; j <= rowEnd; j++) {
                resultList.add(matrix[columnStart][j]);
            }

            columnStart++;

            if (columnStart > columnEnd) {
                break;
            }

            for (int i = columnStart; i <= columnEnd; i++) {
                resultList.add(matrix[i][rowEnd]);
            }

            rowEnd--;

            if (rowStart > rowEnd) {
                break;
            }

            for (int j = rowEnd; j >= rowStart; j--) {
                resultList.add(matrix[columnEnd][j]);
            }

            columnEnd--;

            if (columnStart > columnEnd) {
                break;
            }

            for (int i = columnEnd; i >= columnStart; i--) {
                resultList.add(matrix[i][rowStart]);
            }

            rowStart++;
        }

        return resultList;
    }
}
