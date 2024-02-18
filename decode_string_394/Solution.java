package decode_string_394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder nextFragment = new StringBuilder();
        boolean isNumber = s.charAt(0) >= 48 && s.charAt(0) <= 57;

        for (char character : s.toCharArray()) {
            if (character == '[') {
                stack.push(nextFragment.toString());
                nextFragment = new StringBuilder();
                isNumber = false;
            } else if (character >= 48 && character <= 57) {
                if (isNumber) {
                    nextFragment.append(character);
                } else {
                    stack.push(nextFragment.toString());
                    nextFragment = new StringBuilder().append(character);
                    isNumber = true;
                }
            } else if (character == ']') {
                String stackFragment = stack.pop();

                while (!stackFragment.matches("\\d+")) {
                    nextFragment = new StringBuilder(stackFragment).append(nextFragment);
                    stackFragment = stack.pop();
                }

                String repeatingFragment = nextFragment.toString();
                nextFragment = new StringBuilder();

                stack.push(repeatingFragment.repeat(Math.max(0, Integer.parseInt(stackFragment))));
            } else {
                nextFragment.append(character);
            }
        }

        stack.push(nextFragment.toString());
        StringBuilder result = new StringBuilder();

        while (!stack.empty()) {
            result = new StringBuilder(stack.pop()).append(result);
        }

        return result.toString();
    }
}