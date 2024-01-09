import serialize_and_deserialize_binary_tree_297.Codec;
import serialize_and_deserialize_binary_tree_297.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(5);
        root.right.left.right = new TreeNode(6);
        String serialized = new Codec().serialize(root);
        TreeNode test = new Codec().deserialize(serialized);
    }
}