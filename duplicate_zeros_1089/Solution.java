package duplicate_zeros_1089;

import java.util.Arrays;

public class Solution {
    public void duplicateZeros(int[] arr) {
        // create copy of array
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        // index of current cell of modified array to fill
        int currentIndex = 0;

        // for each cell of copied array or while modified array is not filled
        for (int i = 0; i < arrCopy.length && currentIndex < arr.length; i++) {
            // copy cell from copied array to modified
            arr[currentIndex] = arrCopy[i];
            // increase the index of current cell of modified array to fill
            currentIndex++;

            // if current cell in copy array is 0 and modified array is not filled
            if (arrCopy[i] == 0 && currentIndex < arr.length) {
                // set current cell of modified array to 0
                arr[currentIndex] = 0;
                // increase the index of current cell of modified array to fill
                currentIndex++;
            }
        }
    }
}
