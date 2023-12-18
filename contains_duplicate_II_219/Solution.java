package contains_duplicate_II_219;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer, Integer> occurrencesIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer lastOccurrence = occurrencesIndexes.get(nums[i]);

            if (lastOccurrence != null && k >= Math.abs(lastOccurrence - i)) {
                result = true;
                i = nums.length;
            } else {
                occurrencesIndexes.put(nums[i], i);
            }
        }

        return result;
    }
}
