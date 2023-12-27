package binary_tree_preorder_traversal_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> visitedNodes;

    public List<Integer> preorderTraversal(TreeNode root) {
        visitedNodes = traversIterative(root);
        return visitedNodes;
    }

    private Integer traversRecursive(TreeNode node) {
        if (node == null) {
            return null;
        }

        Integer value = node.val;
        visitedNodes.add(value);
        traversRecursive(node.left);
        traversRecursive(node.right);

        return value;
    }

    private List<Integer> traversIterative(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            answer.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            if (root.left != null)
                stack.push(root.left);
        }

        return answer;
    }
}
