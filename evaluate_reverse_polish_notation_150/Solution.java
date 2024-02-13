package evaluate_reverse_polish_notation_150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> calculator = new Stack<>();
        int first;
        int second;

        for (String t : tokens) {
            switch (t) {
                case ("+") :
                    second = calculator.pop();
                    first = calculator.pop();
                    calculator.push(first + second);
                    break;
                case ("-") :
                    second = calculator.pop();
                    first = calculator.pop();
                    calculator.push(first - second);
                    break;
                case ("*") :
                    second = calculator.pop();
                    first = calculator.pop();
                    calculator.push(first * second);
                    break;
                case ("/") :
                    second = calculator.pop();
                    first = calculator.pop();
                    calculator.push(first / second);
                    break;
                default :
                    calculator.push(Integer.parseInt(t));
            }
        }

        return calculator.pop();
    }
}
