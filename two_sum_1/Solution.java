package two_sum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> additionIndex = new HashMap<>();
        int[] resultArray = new int[2];

        additionIndex.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int addition = target - nums[i];

            if (additionIndex.containsKey(addition)) {
                resultArray[0] = additionIndex.get(addition);
                resultArray[1] = i;
                i = nums.length;
            } else {
                additionIndex.put(nums[i], i);
            }
        }

        return resultArray;
    }
}
