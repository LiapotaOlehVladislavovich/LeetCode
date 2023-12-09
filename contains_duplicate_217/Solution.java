package contains_duplicate_217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;

        Set<Integer> uniqueNums = new HashSet<>();

        for(int num : nums) {
            if (uniqueNums.contains(num)) {
                result = true;
                break;
            } else {
                uniqueNums.add(num);
            }
        }

        return result;
    }
}
