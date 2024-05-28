package get_equal_substrings_within_budget_1208;

public class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        //save length of arrays
        int n = s.length();
        //convert s string to character array
        char[] sAsArray = s.toCharArray();
        //convert a string to character array
        char[] tAsArray = t.toCharArray();
        //create array of absolute difference between characters
        int[] characterDifference = new int[n];

        //for each pair of characters
        for (int i = 0; i < n; i++) {
            //count absolute difference between characters ASCII value
            characterDifference[i] = Math.abs(sAsArray[i] - tAsArray[i]);
        }

        //create variable to save maximal window size
        int maxWindowSize = 0;
        //create variable for left border of sliding window
        int leftWindowBorder = 0;
        //create variable for right border of sliding window
        int rightWindowBorder = 0;
        //create variable to save cost of current sliding window
        int windowCost = 0;

        //while sliding window has not reached the end of array
        while (rightWindowBorder < n) {
            //increase cost of window to variable of right border pointer
            windowCost += characterDifference[rightWindowBorder];

            //if window`s cost is lower or equal than maximum cost
            if (windowCost <= maxCost) {
                //compare and save current and previous maximum window size
                maxWindowSize = Math.max(maxWindowSize, rightWindowBorder - leftWindowBorder + 1);
            } else {
                //while window`s cost is bigger than maximum cost and window`s borders are valid
                while (windowCost > maxCost && leftWindowBorder <= rightWindowBorder) {
                    //reduce cost of window to variable of left border pointer
                    windowCost -= characterDifference[leftWindowBorder];
                    //increment left border pointer
                    leftWindowBorder++;
                }
            }

            //increment right border pointer
            rightWindowBorder++;
        }

        //return result maximum window size
        return maxWindowSize;
    }
}