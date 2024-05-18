package distribute_coins_in_binary_tree_979;

public class Solution {
    private int result;

    /**
     * Method gets the binary tree with n nodes where each node in the tree has node.val coins.
     * In one move, we may choose two adjacent nodes and move one coin from one node to another.
     * A move may be from parent to child, or from child to parent.
     * Method counts minimal number of required moves.
     *
     * @param root of a binary tree
     * @return minimum number of moves required to make every node have exactly one coin
     * */
    public int distributeCoins(TreeNode root) {
        //set public variable as 0
        result = 0;
        //call method that fulfils request of nodes
        fulfilRequestForCoins(root);
        //return result
        return result;
    }

    /**
     * Method gets node, counts coins that node need to get or remove.
     * Save in result requests from child nodes.
     *
     * @param node current node
     * @return request for coins
     * */
    private int fulfilRequestForCoins(TreeNode node) {
        //if node is empty
        if (node == null) {
            //return 0, no coins required
            return 0;
        }

        //count request for current node
        int request = 1 - node.val;

        //count requests from subtrees
        int requestFromLeft = fulfilRequestForCoins(node.left);
        int requestFromRight = fulfilRequestForCoins(node.right);

        //add to result absolute values from child requests
        result += Math.abs(requestFromLeft) + Math.abs(requestFromRight);

        //return request of current node
        return request + requestFromLeft + requestFromRight;
    }
}