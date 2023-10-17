package remove_element_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int currentIndex = 0;
        int placeToSet = nums.length - 1;
        int variableForSaving;

        while (currentIndex <= placeToSet) {
            if (nums[currentIndex] == val) {
                variableForSaving = nums[currentIndex];
                nums[currentIndex] = nums[placeToSet];
                nums[placeToSet] = variableForSaving;
                k--;
                placeToSet--;
            } else {
                currentIndex++;
            }
        }

        return k;
    }
}
