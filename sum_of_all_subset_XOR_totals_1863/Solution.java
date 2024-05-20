package sum_of_all_subset_XOR_totals_1863;

public class Solution {
    private int[] nums;

    /**
     * Method counts the sum of all XOR totals for every subset of given array.
     * The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
     *
     * @param nums integer array
     * @return sum of all XOR totals
     * */
    public int subsetXORSum(int[] nums) {
        //make nums a global variable
        this.nums = nums;
        //return result of method XORSum
        return XORSum(0, 0);
    }

    /**
     * Method counts sum of XOR for each subsequence
     *
     * @param currentIndex index of current number
     * @param previousXor XOR of previous 2 indexes
     * */

    private int XORSum(int currentIndex, int previousXor) {
        //if each index visited
        if (currentIndex == nums.length) {
            //return already calculated XOR
            return previousXor;
        }

        //return sum of XOR fir subsequence with current index included, and excluded
        return XORSum(currentIndex + 1, previousXor ^ nums[currentIndex])
                + XORSum(currentIndex + 1, previousXor);
    }
}