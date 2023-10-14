package replace_elements_with_greatest_element_on_right_side_1299;

public class Solution {
    public int[] replaceElements(int[] arr) {
        int maximumValue = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maximumValue) {
                int currentValue = arr[i];
                arr[i] = maximumValue;
                maximumValue = currentValue;
            } else {
                arr[i] = maximumValue;
            }
        }

        return arr;
    }
}
