package add_one_row_to_tree_623;

public class Solution {
    private int val;
    private int depth;

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.val = val;
        this.depth = depth;

        if (depth == 1) {
            return new TreeNode(val, root, null);
        }

        return addOneNode(root, 1, false);
    }

    private TreeNode addOneNode(TreeNode node, int thisDepth, boolean isLeft) {
        if (node == null) {
            if (thisDepth == depth) {
                return new TreeNode(val);
            }

            return null;
        }

        if (thisDepth == depth) {
            if (isLeft) {
                return new TreeNode(val, node, null);
            }

            return new TreeNode(val, null, node);
        }

        node.left = addOneNode(node.left, thisDepth + 1, true);
        node.right = addOneNode(node.right, thisDepth + 1, false);
        return node;
    }
}