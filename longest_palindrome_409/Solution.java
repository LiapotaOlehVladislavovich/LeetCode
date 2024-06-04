package longest_palindrome_409;

public class Solution {
    public int longestPalindrome(String s) {
        //create array to fit all English letters
        int[] lettersOccurrence = new int[52];

        //for each letter in the string
        for (char c : s.toCharArray()) {
            //increment occurrence in corresponding cell of the array
            lettersOccurrence[(c <= 90) ? c - 65 : c - 71]++;
        }

        //create variable to save the answer
        int answer = 0;
        //create flag that show that there were letters with odd number of occurrences
        boolean wasOdd = false;

        //for each English letter
        for (int l : lettersOccurrence) {
            //if occurrence is even
            if (l % 2 == 0) {
                //add all the occurrence
                answer += l;
            } else {
                //add occurrence minus 1, to make it even
                answer += l - 1;
                //make flag positive
                wasOdd = true;
            }
        }

        //if flag is positive return answer incremented because we can set letter int the center
        //otherwise return plain answer because it is already maximal
        return (wasOdd) ? answer + 1 : answer;
    }
}