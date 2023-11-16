package diagonal_traverse_498;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int matXLength = mat.length;
        int matYLength = mat[0].length;
        int[] array = new int[matXLength * matYLength];
        int currentArrayIndex = 0;
        boolean isGoingRight = true;
        int currentMatrixX = 0;
        int currentMatrixY = 0;

        while (currentArrayIndex < array.length) {
            array[currentArrayIndex] = mat[currentMatrixX][currentMatrixY];

            if (isGoingRight) {
                if (currentMatrixX == 0 || currentMatrixY == matYLength - 1) {
                    if (currentMatrixY == matYLength - 1) {
                        currentMatrixX++;
                    } else {
                        currentMatrixY++;
                    }
                    isGoingRight = false;
                } else {
                    currentMatrixX--;
                    currentMatrixY++;
                }
            } else {
                if (currentMatrixX == matXLength - 1 || currentMatrixY == 0) {
                    if (currentMatrixX == matXLength - 1) {
                        currentMatrixY++;
                    } else {
                        currentMatrixX++;
                    }
                    isGoingRight = true;
                } else {
                    currentMatrixX++;
                    currentMatrixY--;
                }
            }

            currentArrayIndex++;
        }

        return array;
    }
}
