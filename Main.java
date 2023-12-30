import binary_tree_postorder_traversal_145.Solution;
import binary_tree_postorder_traversal_145.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3,
                                null,
                                null),
                        null));
        new Solution().postorderTraversal(root);
    }
}