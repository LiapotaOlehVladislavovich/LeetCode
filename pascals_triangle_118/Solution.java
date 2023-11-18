package pascals_triangle_118;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<>();

        List<Integer> row = new LinkedList<>();
        row.add(1);
        triangle.add(row);

        int nextRowNumber = 2;
        int rememberValue;
        List<Integer> rememberRow;

        while (nextRowNumber <= numRows) {
            rememberRow = new LinkedList<>();
            rememberValue = 0;

            for (Integer r : row) {
                rememberRow.add(r + rememberValue);
                rememberValue = r;
            }

            rememberRow.add(rememberValue);
            row = rememberRow;
            triangle.add(row);
            nextRowNumber++;
        }

        return triangle;
    }
}
