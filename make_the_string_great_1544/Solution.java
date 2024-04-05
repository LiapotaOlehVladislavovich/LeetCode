package make_the_string_great_1544;

public class Solution {
    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i)-s.charAt(i + 1)) == 32) {
                if (i == 0) {
                    if (s.length() == 2) {
                        s = "";
                    } else {
                        s = s.substring(i + 2);
                    }
                } else if (i + 1 == s.length() - 1) {
                    s = s.substring(0, i);
                } else {
                    s = s.substring(0, i) + s.substring(i + 2);
                }

                i = -1;
            }
        }

        return s;
    }
}