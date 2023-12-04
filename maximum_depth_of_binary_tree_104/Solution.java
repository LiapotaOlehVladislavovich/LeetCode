package maximum_depth_of_binary_tree_104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(1 + maxDepth(root.right), 1 + maxDepth(root.left));
    }
}
