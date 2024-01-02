package path_sum_112;

public class Solution {
    int targetSum;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        return countPathSum(root, 0);
    }

    private boolean countPathSum(TreeNode node, int currentSum) {
        if (node == null) {
            return false;
        }

        currentSum += node.val;

        if (node.left == null && node.right == null) {
            return (currentSum == targetSum);
        }

        return countPathSum(node.left, currentSum) || countPathSum(node.right, currentSum);
    }
}
