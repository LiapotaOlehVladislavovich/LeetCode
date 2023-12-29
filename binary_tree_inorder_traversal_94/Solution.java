package binary_tree_inorder_traversal_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> visitedNodes;

    public List<Integer> inorderTraversal(TreeNode root) {
        visitedNodes = new ArrayList<>();
        traverseIterative(root);
        return visitedNodes;
    }

    private void traversRecursive(TreeNode node) {
        if(node != null) {
            traversRecursive(node.left);
            visitedNodes.add(node.val);
            traversRecursive(node.right);
        }
    }

    private void traverseIterative(TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            visitedNodes.add(node.val);
            node = node.right;
        }
    }
}
