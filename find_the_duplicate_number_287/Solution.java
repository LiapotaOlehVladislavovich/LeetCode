package find_the_duplicate_number_287;

public class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length - 1];

        for (int n : nums) {
            int visitedIndex = n - 1;

            if (visited[visitedIndex]) {
                return n;
            } else {
                visited[visitedIndex] = true;
            }
        }

        return 0;
    }
}
