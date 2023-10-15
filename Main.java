import move_zeroes_283.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{4,2,4,0,0,3,0,5,1,0};
        new Solution().moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}
