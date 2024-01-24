package maximum_depth_of_nary_tree_559;

public class Solution {
    public int maxDepth(Node root) {
        return countDepth(root);
    }

    private int countDepth(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.children.isEmpty()) {
            return 1;
        }

        int subtreeDepth = 0;

        for (Node child : node.children) {
            subtreeDepth = Math.max(subtreeDepth, countDepth(child));
        }

        return 1 + subtreeDepth;
    }
}
