package generate_parentheses_22;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<String> generatedParenthesis;

    public List<String> generateParenthesis(int n) {
        generatedParenthesis = new LinkedList<>();
        tryParenthesis(new StringBuilder(), n, n);
        return generatedParenthesis;
    }

    private void tryParenthesis(StringBuilder triedCombination, int opened, int closed) {
        if (opened == 0 && closed == 0) {
            generatedParenthesis.add(triedCombination.toString());
        } else if (opened <= closed) {
            int previousLength = triedCombination.length();

            if (opened > 0) {
                triedCombination.append("(");
                tryParenthesis(triedCombination, opened - 1, closed);
                triedCombination.replace(previousLength, previousLength + 1, "");
            }

            triedCombination.append(")");
            tryParenthesis(triedCombination, opened, closed - 1);
            triedCombination.replace(previousLength, previousLength + 1, "");
        }
    }
}
