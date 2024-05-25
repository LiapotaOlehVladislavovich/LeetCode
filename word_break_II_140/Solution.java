package word_break_II_140;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> wordDict;
    List<String> breakResults;

    public List<String> wordBreak(String s, List<String> wordDict) {
        //make word dictionary public
        this.wordDict = wordDict;
        //make a new empty result list
        this.breakResults = new LinkedList<>();
        //run recursive method
        tryBreak(s, "");
        //return result
        return breakResults;
    }

    private void tryBreak(String s, String previousString) {
        //save length of the string
        int stringLength = s.length();

        //for each word in dictionary
        for (String word : wordDict) {
            //save the length of the word
            int wordLength = word.length();

            //if the word is smaller than the string
            if (wordLength < stringLength) {
                // the word is a prefix of the string
                if (s.substring(0, wordLength).equals(word)) {
                    // recursively call after removing prefix from string and adding it to result string
                    tryBreak(s.substring(wordLength), previousString + word + " ");
                }
                //if the word is equal to string
            } else if (word.equals(s)) {
                // add broken string to result list
                breakResults.add(previousString + word);
            }
        }
    }
}