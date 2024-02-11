package valid_parentheses_20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (bracket == '}') {
                if (stack.empty() || stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (bracket == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}