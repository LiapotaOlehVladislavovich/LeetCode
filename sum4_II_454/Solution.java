package sum4_II_454;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);
        Map<Integer, Integer> map12 = new HashMap<>();
        for (int k : nums1) {
            for (int i : nums2) {
                int sum = k + i;
                map12.put(sum, map12.getOrDefault(sum, 0) + 1);
            }
        }

        int result = 0;
        for (int k : nums3) {
            for (int i : nums4) {
                result += map12.getOrDefault(-(k + i), 0);
            }
        }

        return result;
    }
}
