package first_unique_character_in_a_string_387;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> firstIndex = new HashMap<>();

        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            if (firstIndex.containsKey(sArray[i])) {
                firstIndex.put(sArray[i], -1);
            } else {
                firstIndex.put(sArray[i], i);
            }
        }

        int minimalIndex = -1;

        for (Map.Entry<Character, Integer> entry : firstIndex.entrySet()) {
            int value = entry.getValue();

            if (value != -1) {
                minimalIndex = (minimalIndex == -1) ? value : Math.min(minimalIndex, value);
            }
        }

        return minimalIndex;
    }
}
