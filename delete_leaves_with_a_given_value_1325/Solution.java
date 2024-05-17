package delete_leaves_with_a_given_value_1325;

public class Solution {
    private int target;

    /**
     * Method gets a binary tree and removes all lives with target value.
     * Once a leaf node with value target is deleted,
     * if its parent node becomes a leaf node and has the value target, it should also be deleted
     *
     * @param root binary tree
     * @param target integer value that need to be removed
     * @return updated tree
     * */
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        //make target a global variable
        this.target = target;
        //return result
        return removeNodeIfLeaf(root);
    }

    /**
     * Method returns updated value of given node
     *
     * @param node node of a binary tree
     * @return updated node
     * */
    private TreeNode removeNodeIfLeaf(TreeNode node) {
        //if node is null
        if (node == null) {
            //remains null
            return null;
        }

        //recursively call the method for child nodes of current node
        node.left = removeNodeIfLeaf(node.left);
        node.right = removeNodeIfLeaf(node.right);

        //if node is the leaf node with target value
        if (node.left == null && node.right == null && node.val == target) {
            //node becomes null
            return null;
        }

        //return updated value of node
        return node;
    }
}