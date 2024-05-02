package largest_positive_integer_that_exists_with_Its_negative_2441;

public class Solution {
    /**
     * Method finds the largest positive integer k such that -k also exists in the array.
     *
     * @param nums integer array without 0
     * @return maximal k value, or -1 if required k is not in array.
     * */
    public int findMaxK(int[] nums) {
        // Array that represents occurrence of all possible pairs of k and -k
        int[] occurrence = new int[1000];
        // Variable to store maximum k
        int maxK = -1;

        // For each number in nums
        for (int n : nums) {
            // If number is negative
            if (n < 0) {
                // Turn it positive
                n = -n;

                // Depending on the value of occurrences
                switch (occurrence[n - 1]) {
                    // No occurrences
                    case 0:
                        // Set occurrence to -1 to represent negative occurrence
                        occurrence[n - 1] = -1;
                        break;
                    // Positive occurrences
                    case 1:
                        // Set occurrence to 2 to represent that has been found positive and negative occurrence
                        occurrence[n - 1] = 2;
                        // Set number as maximum if it is bigger than maximum
                        maxK = Math.max(maxK, n);
                        break;
                    default:
                        break;
                }
            } else {
                // Depending on the value of occurrences
                switch (occurrence[n - 1]) {
                    // No occurrences
                    case 0:
                        // Set occurrence to -1 to represent negative occurrence
                        occurrence[n - 1] = 1;
                        break;
                    // Negative occurrences
                    case -1:
                        // Set occurrence to 2 to represent that has been found positive and negative occurrence
                        occurrence[n - 1] = 2;
                        // Set number as maximum if it is bigger than maximum
                        maxK = Math.max(maxK, n);
                        break;
                    default:
                        break;
                }
            }
        }

        // Return maximum
        return maxK;
    }
}