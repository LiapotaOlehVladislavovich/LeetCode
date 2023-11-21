package longest_common_prefix_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(longestPrefix) != 0) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);

                if (longestPrefix.isEmpty()) {
                    i = strs.length;
                    break;
                }
            }
        }

        return longestPrefix;
    }
}
