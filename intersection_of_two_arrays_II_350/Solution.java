package intersection_of_two_arrays_II_350;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> firstArrayOccurrences = new HashMap<>();

        for (int num : nums1) {
            firstArrayOccurrences.merge(num, 1, Integer::sum);
        }

        List<Integer> result = new LinkedList<>();

        for (int num : nums2) {
            Integer occurrences = firstArrayOccurrences.get(num);

            if (occurrences != null && occurrences != 0) {
                result.add(num);
                firstArrayOccurrences.put(num, occurrences - 1);
            }
        }

        int[] resultArray = new int[result.toArray().length];
        int index = 0;

        for (int r : result) {
            resultArray[index] = r;
            index++;
        }

        return resultArray;
    }
}
