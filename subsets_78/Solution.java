package subsets_78;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> resultList;
    int[] nums;

    /**
     * Method finds the power set of given array.
     *
     * @param nums integer array of unique elements
     * @return list of all possible subsets
     * */
    public List<List<Integer>> subsets(int[] nums) {
        //make nums a global variable
        this.nums = nums;
        //make new global variable for answer
        resultList = new LinkedList<>();
        //fill answer with subsets
        generateSubset(0, new ArrayList<>());
        //return result
        return resultList;
    }

    /**
     * @param currentIndex index of current variable in array
     * @param previousSubset subset created on previous iterations
     * */
    private void generateSubset(int currentIndex, List<Integer> previousSubset) {
        //if crossed through all array
        if (currentIndex == nums.length) {
            //add current subset to answer
            resultList.add(previousSubset);
        } else {
            //go to next index without adding current variable to subsequence
            generateSubset(currentIndex + 1, new LinkedList<>(previousSubset));
            //add current variable to subsequence
            previousSubset.add(nums[currentIndex]);
            //go to next index with adding current variable to subsequence
            generateSubset(currentIndex + 1, new LinkedList<>(previousSubset));
        }
    }
}