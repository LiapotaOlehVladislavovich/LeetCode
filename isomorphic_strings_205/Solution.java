package isomorphic_strings_205;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean result = true;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for (int i = 0; i < sArray.length; i++) {
            if (mapS[sArray[i]] != mapT[tArray[i]]) {
                result = false;
                i = sArray.length;
            } else {
                mapS[sArray[i]] = i + 1;
                mapT[tArray[i]] = i + 1;
            }
        }

        return result;
    }
}
