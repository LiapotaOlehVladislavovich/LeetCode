package validate_binary_search_tree_98;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidNode(root, null, null);
    }

    private boolean isValidNode(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if (((min == null) || (node.val > min)) && ((max == null) || (node.val < max))) {
            return isValidNode(node.left, min, node.val) && isValidNode(node.right, node.val, max);
        }

        return false;
    }
}
