import remove_duplicates_from_sorted_array_26.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{1, 1, 2};
        int testValue = new Solution().removeDuplicates(test);
        System.out.println(Arrays.toString(test));
        System.out.println(testValue);
    }
}
