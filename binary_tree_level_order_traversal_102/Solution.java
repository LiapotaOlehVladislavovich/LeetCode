package binary_tree_level_order_traversal_102;

import java.util.*;

public class Solution {
    List<List<Integer>> resultList;

    public List<List<Integer>> levelOrder(TreeNode root) {
        resultList = new ArrayList<>();
        goOverLevel(0, root);
        return resultList;
    }

    private void goOverLevel (int level, TreeNode node) {
        if (node != null) {
            if (resultList.size() == level) {
                resultList.add(new ArrayList<>());
            }

            resultList.get(level).add(node.val);
            goOverLevel(level + 1, node.left);
            goOverLevel(level + 1, node.right);
        }
    }
}
