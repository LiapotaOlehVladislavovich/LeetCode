package palindrome_partitioning_131;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<String>> result;
    String s;

    public List<List<String>> partition(String s) {
        result = new LinkedList<>();
        this.s = s;
        backtrack(0, new LinkedList<>());
        return result;
    }

    private void backtrack(int currentIndex, List<String> currentList) {
        if (currentIndex == s.length()) {
            result.add(new LinkedList<>(currentList));
        } else {
            for (int i = currentIndex; i < s.length(); i++) {
                if (isPalindrome(currentIndex, i)) {
                    currentList.add(s.substring(currentIndex, i + 1));
                    backtrack(i + 1, currentList);
                    currentList.remove(currentList.size()-1);
                }
            }
        }
    }

    private boolean isPalindrome(int start, int end) {
        boolean palindrome = true;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                palindrome = false;
                start = end;
            } else {
                start++;
                end--;
            }
        }

        return palindrome;
    }
}