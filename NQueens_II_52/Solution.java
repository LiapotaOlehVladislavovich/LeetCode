package NQueens_II_52;

public class Solution {
    int[][] field;
    int n;

    public int totalNQueens(int n) {
        field = new int[n][n];
        this.n = n;
        return currentQueen(0, 0);
    }

    private int currentQueen(int row, int count) {
         for (int i = 0; i < n; i++) {
            if (isNotUnderAttack(row, i)) {
                changeQuin(row, i, 1);

                if (row + 1 == n) {
                    count++;
                } else {
                    count = currentQueen(row + 1, count);
                }

                changeQuin(row, i, -1);
            }
         }

         return count;
    }

    private void changeQuin(int row, int column, int value) {
        for (int i = 0; i < n; i++) {
            field[row][i] = field[row][i] + value;
        }

        int step = 1;

        for (int i = row + 1; i < n; i++) {
            field[i][column] = field[i][column] + value;

            if (column - step >= 0) {
                field[i][column - step] = field[i][column - step] + value;
            }

            if (column + step < n) {
                field[i][column + step] = field[i][column + step] + value;
            }

            step++;
        }
    }

    private boolean isNotUnderAttack(int row, int column) {
        return field[row][column] == 0;
    }
}
