package nary_tree_level_order_traversal_429;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resultList = new LinkedList<>();
        List<Node> currentLevel = new LinkedList<>();

        if (root != null) {
            currentLevel.add(root);
            while (!currentLevel.isEmpty()) {
                List<Node> nextLevel = new LinkedList<>();
                List<Integer> integerLevel = new LinkedList<>();

                for (Node c : currentLevel) {
                    nextLevel.addAll(c.children);
                    integerLevel.add(c.val);
                }

                resultList.add(integerLevel);
                currentLevel = nextLevel;
            }
        }

        return resultList;
    }
}