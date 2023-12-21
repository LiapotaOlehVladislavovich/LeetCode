package find_duplicate_subtrees652;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    List<TreeNode> result;
    Map<String, Integer> serialCount;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        result = new LinkedList<>();
        serialCount = new HashMap<>();
        getSubtree(root);
        return result;
    }

    private String getSubtree(TreeNode root) {
        if (root == null) {
            return "null";
        }

        String serial = root.val + "," + getSubtree(root.left) + "," + getSubtree(root.right);
        int frequency = serialCount.getOrDefault(serial, 0);
        serialCount.put(serial, ++frequency);

        if (frequency == 2) {
            result.add(root);
        }

        return serial;
    }
}
