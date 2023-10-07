import merge_sorted_array_88.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,0,0,0};
        new Solution().merge(test, 3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(test));
    }
}
