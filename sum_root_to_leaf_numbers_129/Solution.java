package sum_root_to_leaf_numbers_129;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNode(root, 0);
    }

    private int sumNode(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        return sumNode(node.left, sum) + sumNode(node.right, sum);
    }
}