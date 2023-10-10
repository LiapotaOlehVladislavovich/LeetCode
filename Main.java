import remove_element_27.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{3,2,2,3};
        int testValue = new Solution().removeElement(test, 3);
        System.out.println(Arrays.toString(test));
        System.out.println(testValue);
    }
}
