package pascals_triangle_II_119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        result.add(1);
        long previousNumber=1;

        for(int i=1;i<=rowIndex;i++){
            long nextNumber= previousNumber * (rowIndex - i + 1) / i;
            result.add((int) nextNumber);
            previousNumber =nextNumber;
        }

        return result;
    }
}
