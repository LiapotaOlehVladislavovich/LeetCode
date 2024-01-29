package binary_search_tree_iterator_173;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BSTIterator {
    List<Integer> traVersedTree;
    ListIterator<Integer> iterator;

    public BSTIterator(TreeNode root) {
        traVersedTree = new LinkedList<>();
        traVerseIteratively(root);
        iterator = traVersedTree.listIterator();
    }

    private void traVerseIteratively (TreeNode node) {
        if (node != null) {
            traVerseIteratively(node.left);
            traVersedTree.add(node.val);
            traVerseIteratively(node.right);
        }
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
