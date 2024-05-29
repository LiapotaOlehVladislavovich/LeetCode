package number_of_steps_to_reduce_a_number_in_binary_representation_to_one_1404;

public class Solution {
    public int numSteps(String s) {
        int totalSteps = 0;

        while (!s.equals("1")) {
            char lastChar = s.charAt(s.length() - 1);

            if (lastChar == '0') {
                s = s.substring(0, s.length() - 1);
            } else {
                s = increment(s);
            }

            totalSteps++;
        }

        return totalSteps;
    }

    private String increment(String s) {
        StringBuilder newString = new StringBuilder();
        int previousDigit = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentDigit = s.charAt(i) - 48 + previousDigit;
            newString = new StringBuilder().append(currentDigit % 2).append(newString);
            previousDigit = currentDigit / 2;
        }

        if (previousDigit == 1) {
            newString = new StringBuilder().append(1).append(newString);
        }

        return newString.toString();
    }
}