package happy_number_202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedNumbers = new HashSet<>();

        while (n != 1 && !usedNumbers.contains(n)) {
            usedNumbers.add(n);

            int newNumberSaver = 0;

            while (n != 0) {
                int localNumber = n % 10;
                newNumberSaver += localNumber * localNumber;
                n = n / 10;
            }

            n = newNumberSaver;
        }

        return n == 1;
    }
}
