package construct_binary_tree_from_inorder_and_postorder_traversal_106;

public class Solution {
    int[] inorder;
    int[] postorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        return buildNode(0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildNode(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postEnd]);

        if (inStart == inEnd) {
            return root;
        }

        int rootInIndex = inEnd;

        while (inorder[rootInIndex] != postorder[postEnd]) {
            rootInIndex--;
        }

        int leftStep = rootInIndex - inStart;

        root.left = buildNode(inStart, rootInIndex - 1, postStart, postStart + leftStep - 1);
        root.right = buildNode(rootInIndex + 1, inEnd, postStart + leftStep, postEnd - 1);
        return root;
    }
}
