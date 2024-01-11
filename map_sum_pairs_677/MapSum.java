package map_sum_pairs_677;

public class MapSum {
    TrieNode root;

    public MapSum() {
        root = new TrieNode(null);
    }

    public void insert(String key, int val) {
        TrieNode node = root;

        for (char k : key.toCharArray()) {
            int index = k - 97;

            if (node.children[index] == null) {
                node.children[index] = new TrieNode(k);
            }

            node = node.children[index];
        }

        node.value = val;
    }

    public int sum(String prefix) {
        TrieNode node = root;

        for (char p : prefix.toCharArray()) {
            int index = p - 97;

            if (node.children[index] == null) {
                return 0;
            }

            node = node.children[index];
        }

        return countWords(node);
    }

    private int countWords(TrieNode prefix) {
        if (prefix == null) {
            return 0;
        }

        int sum = prefix.value;
        for (TrieNode p : prefix.children) {
            sum += countWords(p);
        }

        return sum;
    }

    private static class TrieNode{
        Character nodeVal;
        TrieNode[] children;
        int value;

        public TrieNode(Character nodeVal) {
            this.nodeVal = nodeVal;
            children = new TrieNode[26];
        }
    }
}
