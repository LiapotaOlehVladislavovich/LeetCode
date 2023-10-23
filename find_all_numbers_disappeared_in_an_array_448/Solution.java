package find_all_numbers_disappeared_in_an_array_448;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        int index;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0) {
                index = nums[i] * -1 - 1;
            } else {
                index = nums[i] - 1;
            }

            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }

        return disappearedNumbers;
    }
}
