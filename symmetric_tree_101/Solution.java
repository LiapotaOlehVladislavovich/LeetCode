package symmetric_tree_101;

import java.util.Stack;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirroredIteratively(root);
    }

    private boolean isMirroredRecursively(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val
                && isMirroredRecursively(left.left, right.right)
                && isMirroredRecursively(left.right, right.left);
    }

    private boolean isMirroredIteratively(TreeNode node) {
        if (node == null) {
            return true;
        }

        Stack<TreeNode> lStack = new Stack<>();
        Stack<TreeNode> rStack = new Stack<>();
        lStack.push(node.left); rStack.push(node.right);

        while (!lStack.isEmpty() && !rStack.isEmpty())  {
            TreeNode t1 = lStack.pop();
            TreeNode t2 = rStack.pop();
            if (t1 == null && t2 == null) {
                continue;
            }

            if (t1 == null || t2 == null) {
                return false;
            }

            if (t1.val != t2.val) {
                return false;
            }

            lStack.push(t1.right); lStack.push(t1.left);
            rStack.push(t2.left);  rStack.push(t2.right);
        }

        return lStack.isEmpty() && rStack.isEmpty();
    }
}
