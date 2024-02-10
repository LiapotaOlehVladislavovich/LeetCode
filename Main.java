import min_stack_155.MinStack;

public class Main {
    public static void main(String[] args) {
        MinStack test = new MinStack();
        test.push(2147483646);
        test.push(2147483646);
        test.push(2147483646);
        test.top();
        test.pop();
        test.getMin();
        test.pop();
        test.getMin();
        test.pop();
        test.push(2147483647);
        test.top();
        test.getMin();
        test.push(-2147483648);
        test.top();
        test.getMin();
        test.pop();
        test.getMin();
    }
}