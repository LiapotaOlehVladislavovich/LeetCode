package flood_fill_733;

public class Solution {
    private int[][] image;
    int m;
    int n;
    int newColor;
    int oldColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        m = image.length;
        n = image[0].length;
        newColor = color;
        oldColor = image[sr][sc];
        fillPixel(sr, sc);
        return image;
    }

    private void fillPixel(int i, int j) {
        if (!(i < 0 || i >= m || j < 0 || j >= n || image[i][j] != oldColor || image[i][j] == newColor)) {
           image[i][j] = newColor;
           fillPixel(i + 1, j);
           fillPixel(i - 1, j);
           fillPixel(i, j + 1);
           fillPixel(i, j - 1);
        }
    }
}