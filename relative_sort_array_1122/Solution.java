package relative_sort_array_1122;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //create array to store occurrences of each element in arr1
        int[] occurrences = new int[1001];

        //for each number in arr1
        for (int a : arr1) {
            //increment occurrence in corresponding cell
            occurrences[a]++;
        }

        //create pointer to a last unsorted cell in array
        int positionIndex = 0;

        //for each number in arr2
        for (int a : arr2) {
            //while occurrence of corresponding cell exists
            while (occurrences[a] > 0) {
                //decrement occurrence
                occurrences[a]--;
                //put the number into the last unsorted cell
                arr1[positionIndex] = a;
                //move pointer to the next unsorted cell
                positionIndex++;
            }
        }

        //for each occurrence
        for (int i = 0; i < occurrences.length; i++) {
            //while occurrence of corresponding cell exists
            while (occurrences[i] > 0) {
                //decrement occurrence
                occurrences[i]--;
                //put the number into the last unsorted cell
                arr1[positionIndex] = i;
                //move pointer to the next unsorted cell
                positionIndex++;
            }
        }

        //return sorted array
        return arr1;
    }
}