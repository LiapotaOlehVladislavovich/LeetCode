import remove_element_27.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(new Solution().removeElement(test, 2));
        System.out.println(Arrays.toString(test));
    }
}
