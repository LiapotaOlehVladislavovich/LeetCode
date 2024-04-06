package minimum_remove_to_make_valid_parentheses_1249;

public class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] sByCharacters = s.toCharArray();
        StringBuilder newS = new StringBuilder();

        int openCounter = 0;

        for (int i = 0; i < sByCharacters.length; i++) {
            if (sByCharacters[i] == '(') {
                openCounter++;
            } else if (sByCharacters[i] == ')') {
                if (openCounter == 0) {
                    sByCharacters[i] = '*';
                } else {
                    openCounter--;
                }
            }
        }

        int j = sByCharacters.length - 1;

        while (openCounter > 0) {
            if (sByCharacters[j] == '(') {
                sByCharacters[j] = '*';
                openCounter--;
            }

            j--;
        }

        for (char c : sByCharacters) {
            newS.append((c == '*') ? "" : c);
        }

        return newS.toString();
    }
}