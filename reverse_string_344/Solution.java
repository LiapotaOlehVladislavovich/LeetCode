package reverse_string_344;

public class Solution {
    public void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length - 1;

        while (startIndex < endIndex) {
            char charSaver = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = charSaver;
            startIndex++;
            endIndex--;
        }
    }
}
