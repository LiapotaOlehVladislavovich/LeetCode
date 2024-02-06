import number_of_islands_200.Solution;

public class Main {
    public static void main(String[] args) {
        char[][] test = new char[][] {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        new Solution().numIslands(test);
    }
}