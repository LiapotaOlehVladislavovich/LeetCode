import replace_words_648.Solution;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dictionary = new LinkedList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        new Solution().replaceWords(dictionary, "the cattle was rattled by the battery");
    }
}