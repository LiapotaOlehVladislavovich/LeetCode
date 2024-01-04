package construct_binary_tree_from_preorder_and_inorder_traversal_105;

public class Solution {
    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return buildNode(0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildNode(int preStart, int preEnd, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        if (preStart == preEnd) {
            return  new TreeNode(preorder[preStart]);
        }

        int inRoot = inEnd;

        while (inorder[inRoot] != preorder[preStart]) {
            inRoot--;
        }

        int leftPreStart =  preStart + 1;
        int leftPreEnd = leftPreStart + (inRoot - inStart - 1);

        return new TreeNode(preorder[preStart],
                buildNode(leftPreStart, leftPreEnd, inStart, inRoot - 1),
                buildNode(leftPreEnd + 1, preEnd, inRoot + 1, inEnd));
    }
}
