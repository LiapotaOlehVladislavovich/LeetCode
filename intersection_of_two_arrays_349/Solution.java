package intersection_of_two_arrays_349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : nums1) {
            firstSet.add(num);
        }

        for (int num : nums2) {
            if (firstSet.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int resultIndex = 0;

        for (int interNum : intersectionSet) {
            result[resultIndex] = interNum;
            resultIndex++;
        }

        return result;
    }
}
