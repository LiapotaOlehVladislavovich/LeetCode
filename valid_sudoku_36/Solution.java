package valid_sudoku_36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> cells = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char currentCell = board[i][j];

                if (currentCell != '.') {
                    Set<Character> row = rows.get(i);

                    if (row == null) {
                        row = new HashSet<>();
                        row.add(currentCell);
                        rows.put(i, row);
                    } else if (row.contains(currentCell)) {
                        return false;
                    } else {
                        row.add(currentCell);
                        rows.put(i, row);
                    }

                    Set<Character> column = columns.get(j);

                    if (column == null) {
                        column = new HashSet<>();
                        column.add(currentCell);
                        columns.put(j, column);
                    } else if (column.contains(currentCell)) {
                        return false;
                    } else {
                        column.add(currentCell);
                        columns.put(j, column);
                    }

                    int cellNumber = getCellNumber(i, j);
                    Set<Character> cell = cells.get(cellNumber);

                    if (cell == null) {
                        cell = new HashSet<>();
                        cell.add(currentCell);
                        cells.put(cellNumber, cell);
                    } else if (cell.contains(currentCell)) {
                        return false;
                    } else {
                        cell.add(currentCell);
                        cells.put(cellNumber, cell);
                    }
                }
            }
        }

        return true;
    }

    private int getCellNumber(int x, int y) {
        int cellNumber;

        if (x < 3) {
            if (y < 3) {
                cellNumber = 0;
            } else if (y < 6) {
                cellNumber = 1;
            } else {
                cellNumber = 2;
            }
        } else if (x < 6) {
            if (y < 3) {
                cellNumber = 3;
            } else if (y < 6) {
                cellNumber = 4;
            } else {
                cellNumber = 5;
            }
        } else {
            if (y < 3) {
                cellNumber = 6;
            } else if (y < 6) {
                cellNumber = 7;
            } else {
                cellNumber = 8;
            }
        }

        return cellNumber;
    }
}
