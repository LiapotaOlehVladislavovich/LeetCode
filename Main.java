import symmetric_tree_101.Solution;
import symmetric_tree_101.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(2),
                        null),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)));
        new Solution().isSymmetric(root);
    }
}