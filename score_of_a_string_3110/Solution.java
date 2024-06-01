package score_of_a_string_3110;

public class Solution {
    public int scoreOfString(String s) {
        //save string as character array
        char[] chars = s.toCharArray();
        //create variable to store score
        int score = 0;

        //for each sliding window of size 2
        for (int i = 0; i < chars.length - 1; i++) {
            //increase score by absolute difference of two characters from window
            score += Math.abs(chars[i] - chars[i + 1]);
        }

        return score;
    }
}
