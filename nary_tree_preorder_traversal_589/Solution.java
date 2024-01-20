package nary_tree_preorder_traversal_589;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> resultList;

    public List<Integer> preorder(Node root) {
        resultList = new LinkedList<>();
        iterativePreorder(root);
        return resultList;
    }

    private void recursivePreorder(Node node) {
        if (node != null) {
            resultList.add(node.val);

            for (Node c : node.children) {
                recursivePreorder(c);
            }
        }
    }

    private void iterativePreorder(Node root) {
        if (root != null) {
            Stack<Node> visitedNodes = new Stack<>();
            visitedNodes.push(root);

            while (!visitedNodes.empty()) {
                Node currentNode = visitedNodes.pop();

                for (int i = currentNode.children.size() - 1; i >= 0; i--) {
                    visitedNodes.push(currentNode.children.get(i));
                }

                resultList.add(currentNode.val);
            }
        }
    }
}
