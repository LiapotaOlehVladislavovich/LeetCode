package binary_tree_postorder_traversal_145;

import java.util.*;

public class Solution {
    List<Integer> visitedNodes;

    public List<Integer> postorderTraversal(TreeNode root) {
        visitedNodes = new ArrayList<>();
        traversIteratively(root);
        return visitedNodes;
    }

    private void traversRecursively(TreeNode node) {
        if (node != null) {
            traversRecursively(node.left);
            traversRecursively(node.right);
            visitedNodes.add(node.val);
        }
    }

    private void traversIteratively(TreeNode node) {
        Stack<TreeNode> firstStack = new Stack<>();
        Stack<TreeNode> secondStack = new Stack<>();

        if (node != null) {
            firstStack.push(node);

            while (!firstStack.empty()) {
                TreeNode temporalNode = firstStack.pop();
                secondStack.push(temporalNode);

                if (temporalNode.left != null) {
                    firstStack.push(temporalNode.left);
                }

                if (temporalNode.right != null) {
                    firstStack.push(temporalNode.right);
                }
            }

            while (!secondStack.empty()) {
                visitedNodes.add(secondStack.pop().val);
            }
        }
    }
}
