package find_all_duplicates_in_an_array_442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        boolean[] visited = new boolean[100000];

        for (int n : nums) {
            if (!visited[n - 1]) {
                visited[n - 1] = true;
            } else {
                resultList.add(n);
            }
        }

        return resultList;
    }
}
