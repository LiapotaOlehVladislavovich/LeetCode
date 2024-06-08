package continuous_subarray_sum_523;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //create variable to store answer
        boolean answer = false;

        //modulo to k of sub array prefix
        int prefixModulo = 0;
        //hash map to store index of start prefix with designated modulo
        Map<Integer, Integer> seenModulo = new HashMap<>();
        //put prefix with modulo 0 and start index -1
        seenModulo.put(0, -1);

        //for each number in array
        for (int i = 0; i < nums.length; i++) {
            //count modulo of current prefix
            prefixModulo = (prefixModulo + nums[i]) % k;

            //if there is already prefix with result modulo
            if (seenModulo.containsKey(prefixModulo)) {
                //if the length of sub array is 2 or more
                if (i - seenModulo.get(prefixModulo) > 1) {
                    //set answer as true
                    answer = true;
                    //end the cycle
                    i = nums.length;
                }
            } else {
                //put index if first occurrence of result modulo
                seenModulo.put(prefixModulo, i);
            }
        }

        //return answer
        return answer;
    }
}