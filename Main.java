import balanced_binary_tree_110.Solution;
import balanced_binary_tree_110.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        new Solution().isBalanced(test);
    }
}