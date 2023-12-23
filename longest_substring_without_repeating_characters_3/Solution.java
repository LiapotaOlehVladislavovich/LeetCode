package longest_substring_without_repeating_characters_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> lastOccurrenceOfCharacter = new HashMap<>();

        int maxLength = 0;
        int startIndex = 0;
        int endIndex = 0;

        while (endIndex < n) {
            char currentCharacter = s.charAt(endIndex);
            startIndex = Math.max(lastOccurrenceOfCharacter.getOrDefault(currentCharacter, 0), startIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
            lastOccurrenceOfCharacter.put(currentCharacter, endIndex + 1);
            endIndex++;
        }

        return maxLength;
    }
}
