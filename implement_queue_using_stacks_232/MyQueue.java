package implement_queue_using_stacks_232;

import java.util.Stack;

public class MyQueue {
    private final Stack<Integer> stackOrder;
    private final Stack<Integer> queueOrder;

    public MyQueue() {
        stackOrder = new Stack<>();
        queueOrder = new Stack<>();
    }

    public void push(int x) {
        stackOrder.push(x);
    }

    public int pop() {
        if (queueOrder.empty()) {
            while (!stackOrder.empty()) {
                queueOrder.push(stackOrder.pop());
            }
        }

        return queueOrder.pop();
    }

    public int peek() {
        if (queueOrder.empty()) {
            while (!stackOrder.empty()) {
                queueOrder.push(stackOrder.pop());
            }
        }

        return queueOrder.peek();
    }

    public boolean empty() {
        return stackOrder.empty() && queueOrder.empty();
    }
}
