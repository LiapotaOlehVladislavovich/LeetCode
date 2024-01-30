package delete_node_in_a_BST_450;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return removeNode(root, key);
    }

    private TreeNode removeNode(TreeNode node, int key) {
        if (node == null) {
            return null;
        }

        if (node.val == key) {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                TreeNode successor = getSuccessor(node, node.right);
                node.val = successor.val;
                return node;
            }
        }

        if (node.val > key) {
            node.left = removeNode(node.left, key);
        }

        if (node.val < key) {
            node.right = removeNode(node.right, key);
        }

        return node;
    }

    private TreeNode getSuccessor(TreeNode parent, TreeNode child) {
        if (child.left == null) {
            if (parent.left != null && parent.left == child) {
                parent.left = child.right;
            } if (parent.right != null && parent.right == child) {
                parent.right = child.right;
            }
            return child;
        }

        return getSuccessor(child, child.left);
    }
}
