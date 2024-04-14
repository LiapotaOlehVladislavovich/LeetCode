package sum_of_left_leaves_404;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfNodes(root, false);
    }

    private int sumOfNodes(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }

        if (isLeft && node.left == null && node.right == null) {
            return node.val;
        }

        return sumOfNodes(node.left, true) + sumOfNodes(node.right, false);
    }
}