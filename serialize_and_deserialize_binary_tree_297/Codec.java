package serialize_and_deserialize_binary_tree_297;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    public String serialize(TreeNode root) {
        return nodeToString(root);
    }

    private String nodeToString(TreeNode node) {
        if (node == null) {
            return "null";
        }

        return node.val + "_" + nodeToString(node.left) +
                "_" + nodeToString(node.right);
    }

    public TreeNode deserialize(String data) {
        return buildTree(new HashMap<>(), data.split("_"), 0);
    }

    private TreeNode buildTree (Map<TreeNode, Integer> leftSubtreeBorder, String[] dataArray, int rootIndex) {
        if (dataArray[rootIndex].equals("null")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(dataArray[rootIndex]));
        int leftIndex = rootIndex + 1;
        node.left = buildTree(leftSubtreeBorder, dataArray, leftIndex);
        int rightIndex = (node.left == null) ? leftIndex + 1 : leftSubtreeBorder.get(node.left) + 1;
        node.right = buildTree(leftSubtreeBorder, dataArray, rightIndex);
        leftSubtreeBorder.put(node, (node.right == null) ? rightIndex : leftSubtreeBorder.get(node.right));
        return node;
    }
}
