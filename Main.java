import add_one_row_to_tree_623.Solution;
import add_one_row_to_tree_623.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1)),
                new TreeNode(6,
                        new TreeNode(5),
                        null));
        TreeNode result = new Solution().addOneRow(test, 1, 2);
    }
}