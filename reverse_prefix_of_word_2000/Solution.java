package reverse_prefix_of_word_2000;

public class Solution {
    /**
     * Finds the index of first occurrence of character in string.
     * Revers the substring which starts at 0 index
     * and ends on index of first occurrence of character inclusive.
     * Return the resulting string
     *
     * @param word given string
     * @param ch character to find first occurrence of
     * @return updated string
     * */
    public String reversePrefix(String word, char ch) {
        // Variable to store the result
        String result;
        // Variable to store the index of first occurrence of character in string
        int firstOccurrenceIndex = 0;
        // Variable to store the length of the string
        int length = word.length();

        // While we have not found matching character in string or reach the end of the string
        while (firstOccurrenceIndex < length && word.charAt(firstOccurrenceIndex) != ch) {
            // Increment index
            firstOccurrenceIndex++;
        }

        // If reached the end of the string
        if (firstOccurrenceIndex == length) {
            // Left given string unchanged
            result = word;
        } else {
            // Reverse substring that starts at 0 index
            // and ends on the index of the first occurrence of the character in string
            // append it with the rest of given string or empty string if all the string was reversed
             result =
                    new StringBuilder(word.substring(0, firstOccurrenceIndex + 1))
                            .reverse()
                            .append((firstOccurrenceIndex == length - 1)
                                    ? ""
                                    : word.substring(firstOccurrenceIndex + 1))
                            .toString();
        }

        // Return result value
        return result;
    }
}