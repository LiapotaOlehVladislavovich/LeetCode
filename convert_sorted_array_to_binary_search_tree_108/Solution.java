package convert_sorted_array_to_binary_search_tree_108;

public class Solution {
    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return getSubtree(0, nums.length - 1);
    }

    private TreeNode getSubtree(int start, int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = getSubtree(start, middle - 1);
        node.right = getSubtree(middle + 1, end);
        return node;
    }
}
