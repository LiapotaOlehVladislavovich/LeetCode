package kth_largest_element_in_a_stream_703;

public class KthLargest {
    TreeNode root;
    int k;

    public KthLargest(int k, int[] nums) {
        root = null;

        for (int n : nums) {
            root = addNode(root, n);
        }

        this.k = k;
    }

    public int add(int val) {
        root = addNode(root, val);
        return findLargest(root, k);
    }

    private int findLargest(TreeNode node, int k) {
        int rightSubtreeWeight = (node.right == null) ? 0 : node.right.counter;

        if (k > rightSubtreeWeight) {
            int newK = k - rightSubtreeWeight - 1;
            return (newK == 0) ? node.val : findLargest(node.left, k - rightSubtreeWeight - 1);
        }

        return findLargest(node.right, k);
    }

    private TreeNode addNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (node.val > val) {
            node.left = addNode(node.left, val);
        } else {
            node.right = addNode(node.right, val);
        }

        node.counter++;

        return node;
    }

    private static class TreeNode {
        int val;
        int counter;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            counter = 1;
        }
    }
}
