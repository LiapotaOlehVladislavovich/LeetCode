package replace_words_648;

import java.util.List;

public class Solution {
    TrieNode trieRoot;

    public String replaceWords(List<String> dictionary, String sentence) {
         trieRoot = new TrieNode(null);

         for (String word : dictionary) {
             TrieNode node = trieRoot;

             for (char w : word.toCharArray()) {
                 int index = w - 97;

                 if (node.children[index] == null) {
                     node.children[index] = new TrieNode(w);
                 }

                 node = node.children[index];
             }

             node.isRoot = true;
         }

         StringBuilder resultString = new StringBuilder();

         for (String word : sentence.split(" ")) {
             TrieNode node = trieRoot;
             StringBuilder wordReplacement = new StringBuilder();

             for (char w : word.toCharArray()) {
                 int index = w - 97;

                 if (node.isRoot) {
                     break;
                 } else {
                     if (node.children[index] == null) {
                         break;
                     } else {
                         wordReplacement.append(w);
                         node = node.children[index];
                     }
                 }
             }

             resultString.append((node.isRoot) ? wordReplacement : word).append(" ");
         }

         return resultString.toString().trim();
    }

    private static class TrieNode {
        Character character;
        TrieNode[] children;
        boolean isRoot;

        public TrieNode(Character character) {
            this.character = character;
            children = new TrieNode[26];
        }
    }
}
