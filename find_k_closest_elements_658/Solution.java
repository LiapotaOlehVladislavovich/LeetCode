package find_k_closest_elements_658;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (right - left + 1 > k) {
            if (Math.abs(arr[left] - x) < Math.abs(arr[right] - x)
                    || Math.abs(arr[left] - x) == Math.abs(arr[right] - x) && arr[left] < arr[right]) {
                right--;
            } else {
                left++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (; left <= right; left++) {
            result.add(arr[left]);
        }

        return result;
    }
}