package check_if_n_and_its_double_exist_1346;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean answer = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    answer = true;
                    i = arr.length;
                    j = arr.length;
                }
            }
        }

        return answer;
    }
}
