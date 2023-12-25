package top_k_frequent_elements_347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> frequency.get(b) - frequency.get(a));

        for (int f : frequency.keySet()) {
            maxHeap.offer(f);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}