package nary_tree_postorder_traversal_590;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> resultList;

    public List<Integer> postorder(Node root) {
        resultList = new LinkedList<>();
        iterativePostorder(root);
        return resultList;
    }

    private void recursivePostorder(Node node) {
        if (node != null) {
            for (Node c : node.children) {
                recursivePostorder(c);
            }

            resultList.add(node.val);
        }
    }

    private void iterativePostorder(Node root) {
        Stack<Node> firstStack = new Stack<>();
        Stack<Node> secondStack = new Stack<>();

        if (root != null) {
            firstStack.push(root);

            while (!firstStack.empty()) {
                Node currentNode = firstStack.pop();
                secondStack.push(currentNode);

                for (Node c : currentNode.children) {
                    firstStack.push(c);
                }
            }

            while (!secondStack.empty()) {
                resultList.add(secondStack.pop().val);
            }
        }
    }
}
