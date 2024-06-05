package find_common_characters_1002;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {
        //count letters occurrences in the first word
        int[] intersection = countLetters(words[0]);

        //for each word in array
        for (int i = 1; i < words.length; i++) {
            //count letters in that word
            int[] lettersInWord = countLetters(words[i]);

            //save intersection of this array and previous iteration
            for (int j = 0; j < intersection.length; j++) {
                intersection[j] = Math.min(intersection[j], lettersInWord[j]);
            }
        }

        //create variable to store rsult
        List<String> resultList = new LinkedList<>();
        //for each letter
        for (int i = 0; i < intersection.length; i++) {
            //save it`s String value
            String stringValueOfLetter = Character.toString(i + 'a');

            //add it to result number of times equal to it`s occurrence in intersection
            for (; intersection[i] > 0; intersection[i]--) {
                resultList.add(stringValueOfLetter);
            }
        }

        return resultList;
    }

    /**
     * Method counts letter occurrences in the word
     */
    private int[] countLetters(String word) {
        //array with size 26 where each cell represents one letter
        int[] lettersOccurrence = new int[26];

        //for each character in the given word
        for (char w : word.toCharArray()) {
            //increment occurrence of corresponding letter
            lettersOccurrence[w - 'a']++;
        }

        //return array with letter occurrences
        return lettersOccurrence;
    }
}