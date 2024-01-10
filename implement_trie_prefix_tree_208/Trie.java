package implement_trie_prefix_tree_208;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode(null);
    }

    public void insert(String word) {
        TrieNode node = root;

        for (char w : word.toCharArray()) {
            node = node.children[node.addChild(w)];
        }

        node.isEndNode = true;
    }

    public boolean search(String word) {
        boolean result = true;
        TrieNode node = root;

        for (char w : word.toCharArray()) {
            node = node.children[w - 97];

            if (node == null) {
                result = false;
                break;
            }
        }

        return result && node.isEndNode;
    }

    public boolean startsWith(String prefix) {
        boolean result = true;
        TrieNode node = root;

        for (char p : prefix.toCharArray()) {
            node = node.children[p - 97];

            if (node == null) {
                result = false;
                break;
            }
        }

        return result;
    }

    private static class TrieNode{
        Character nodeValue;
        TrieNode[] children;
        boolean isEndNode;

        private TrieNode(Character nodeValue) {
            children = new TrieNode[26];
            this.nodeValue = nodeValue;
            isEndNode = false;
        }

        private int addChild(Character nodeValue) {
            int index = nodeValue - 97;

            if (children[index] == null) {
                children[index] = new TrieNode(nodeValue);
            }

            return index;
        }
    }
}
