package append_characters_to_string_to_make_subsequence_2486;

public class Solution {
    public int appendCharacters(String s, String t) {
        //save strings as arrays
        char[] sInArray = s.toCharArray();
        char[] tInArray = t.toCharArray();

        //make a pointer to current position in t string
        int tPointer = 0;

        //while we don`t reach the end of one of the strings
        for (int i = 0; i < sInArray.length && tPointer < tInArray.length; i++) {
            //if pointers are pointing on the same character
            if (sInArray[i] == tInArray[tPointer]) {
                //increase pointer on the t string
                tPointer++;
            }
        }

        //return the length of t substring that can`t be a subsequence pf s string
        return tInArray.length - tPointer;
    }
}