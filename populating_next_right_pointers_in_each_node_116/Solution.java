package populating_next_right_pointers_in_each_node_116;

public class Solution {
    public Node connect(Node root) {
        return connectNode(root, null);
    }

    private Node connectNode(Node node, Node rightBrother) {
        if (node == null) {
            return node;
        }

        node.next = rightBrother;
        node.left = connectNode(node.left, node.right);
        node.right = connectNode(node.right, (rightBrother == null) ? null : rightBrother.left);
        return node;
    }
}
