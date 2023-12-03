package climbing_stairs_70;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> countedStairs;

    public int climbStairs(int n) {
        countedStairs = new HashMap<>();
        return countWaysFromStair(n);
    }

    public int countWaysFromStair(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (countedStairs.containsKey(n)) {
            return countedStairs.get(n);
        }

        int result = countWaysFromStair(n - 1) + countWaysFromStair(n - 2);
        countedStairs.put(n, result);

        return result;
    }
}
