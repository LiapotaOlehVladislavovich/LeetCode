package jewels_and_stones_771;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = new HashSet<>();

        for (char jewel : jewels.toCharArray()) {
            jewelsSet.add(jewel);
        }

        int counter = 0;

        for (char stone : stones.toCharArray()) {
            if (jewelsSet.contains(stone)) {
                counter++;
            }
        }

        return counter;
    }
}
