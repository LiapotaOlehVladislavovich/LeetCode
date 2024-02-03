package balanced_binary_tree_110;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return root == null || getHeightBalance(root) != -1;
    }

    private int getHeightBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getHeightBalance(node.left);
        int right = getHeightBalance(node.right);
        return (Math.abs(left - right) > 1 || left == -1 || right == -1) ? -1 : Math.max(left, right) + 1;
    }
}
