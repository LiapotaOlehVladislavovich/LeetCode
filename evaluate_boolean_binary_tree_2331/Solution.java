package evaluate_boolean_binary_tree_2331;

public class Solution {
    /**
     * Method get`s the root of a full binary tree with the following properties:
     * Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
     * Non-leaf nodes have either the value 2 or 3,
     * where 2 represents the boolean OR and 3 represents the boolean AND.
     * Method evaluates the root node:
     * If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
     * Otherwise, evaluate the node's two children
     * and apply the boolean operation of its value with the children's evaluations.
     *
     * @param root of a full binary tree
     * @return boolean value of evaluated root node
     * */
    public boolean evaluateTree(TreeNode root) {
        //if node stores zero
        if (root.val == 0) {
            //return false
            return false;
        }

        //if node stores one
        if (root.val == 1) {
            //return true
            return true;
        }

        //if node stores three
        if (root.val == 2) {
            //return logic OR of recursive call for left and right subtrees
            return evaluateTree(root.left) || evaluateTree(root.right);
        }

        //return logic AND of recursive call for left and right subtrees
        return evaluateTree(root.left) && evaluateTree(root.right);
    }
}