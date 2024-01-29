package insert_into_a_binary_search_tree_701;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode currentNode, int newVal) {
        if(currentNode == null) {
            return new TreeNode(newVal);
        }

        if (currentNode.val > newVal) {
            currentNode.left = insertNode(currentNode.left, newVal);
        } else {
            currentNode.right = insertNode(currentNode.right, newVal);
        }

        return currentNode;
    }
}