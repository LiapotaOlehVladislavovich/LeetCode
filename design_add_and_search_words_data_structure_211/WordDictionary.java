package design_add_and_search_words_data_structure_211;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {
    TrieNode trieRoot;

    public WordDictionary() {
        trieRoot = new TrieNode(null);
    }

    public void addWord(String word) {
        TrieNode node = trieRoot;

        for (char w : word.toCharArray()) {
            if (!node.children.containsKey(w)) {
                node.children.put(w, new TrieNode(w));
            }

            node = node.children.get(w);
        }

        node.isWordsEnd = true;
    }

    public boolean search(String word) {
        return searchWord(word.toCharArray(), 0, trieRoot);
    }

    private boolean searchWord(char[] lettersArray, int index, TrieNode node) {
        if (index == lettersArray.length) {
            return node.isWordsEnd;
        }

        char letter = lettersArray[index++];

        if (letter == '.') {
            boolean result = false;

            for (TrieNode child : node.children.values()) {
                result = result || searchWord(lettersArray, index, child);
            }

            return result;
        }

        if (node.children.containsKey(letter)) {
            return searchWord(lettersArray, index, node.children.get(letter));
        }

        return false;
    }

    private static class TrieNode {
        Character nodeValue;
        Map<Character, TrieNode> children;
        boolean isWordsEnd;

        public TrieNode(Character nodeValue) {
            this.nodeValue = nodeValue;
            children = new HashMap<>();
            isWordsEnd = false;
        }
    }
}
