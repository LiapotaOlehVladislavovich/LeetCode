package find_smallest_letter_greater_than_target_744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result;

        int left = 0;
        int right = letters.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (letters[left] > target) {
            result = letters[left];
        } else if (letters[right] > target) {
            result = letters[right];
        } else {
            result = letters[0];
        }

        return result;
    }
}