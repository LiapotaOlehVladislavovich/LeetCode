package lowest_common_ancestor_of_a_binary_search_tree_235;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return getAncestor(root, p, q);
    }

    private TreeNode getAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root != null && p.val < root.val && q.val < root.val) {
            return getAncestor(root.left, p, q);
        }

        if (root != null && p.val > root.val && q.val > root.val) {
            return getAncestor(root.right, p, q);
        }

        return root;
    }
}
