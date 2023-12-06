package k_th_symbol_in_grammar_779;

public class Solution {
    public int kthGrammar(int n, int k) {
        return generateRows(n, k);
    }

    private int generateRows(int n, int k) {
        if (n == 1) {
            return 0;
        }

        int totalElements = (int) Math.pow(2, (n - 1));
        int halfElements = totalElements / 2;

        if (k > halfElements) {
            return 1 - generateRows(n, k - halfElements);
        }

        return generateRows(n - 1, k);
    }
}
