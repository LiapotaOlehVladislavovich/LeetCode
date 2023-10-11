package valid_mountain_array_941;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        int peakIndex = 0;

        while (peakIndex < arr.length - 1 && arr[peakIndex] < arr[peakIndex + 1]) {
            peakIndex++;
        }

        int canyonIndex = peakIndex;

        while (canyonIndex < arr.length - 1 && arr[canyonIndex] > arr[canyonIndex + 1]) {
            canyonIndex++;
        }

        return peakIndex > 0 && canyonIndex == arr.length - 1 && peakIndex != canyonIndex;
    }
}
