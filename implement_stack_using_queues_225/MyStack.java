package implement_stack_using_queues_225;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {
    Queue<Integer> firstQueue;
    Queue<Integer> secondQueue;
    boolean isFirstQueue;

    public MyStack() {
        firstQueue = new ArrayDeque<>();
        secondQueue = new ArrayDeque<>();
        isFirstQueue = true;
    }

    public void push(int x) {
        if (isFirstQueue) {
            firstQueue.offer(x);
        } else {
            secondQueue.offer(x);
        }
    }

    public int pop() {
        int result = 0;

        if (isFirstQueue) {
            while (!firstQueue.isEmpty()) {
                result = firstQueue.poll();

                if (!firstQueue.isEmpty()) {
                    secondQueue.offer(result);
                }
            }
        } else {
            while (!secondQueue.isEmpty()) {
                result = secondQueue.poll();

                if (!secondQueue.isEmpty()) {
                    firstQueue.offer(result);
                }
            }
        }

        isFirstQueue = !isFirstQueue;

        return result;
    }

    public int top() {
        int result = 0;

        if (isFirstQueue) {
            while (!firstQueue.isEmpty()) {
                result = firstQueue.poll();
                secondQueue.offer(result);
            }
        } else {
            while (!secondQueue.isEmpty()) {
                result = secondQueue.poll();
                firstQueue.offer(result);
            }
        }

        isFirstQueue = !isFirstQueue;

        return result;
    }

    public boolean empty() {
        return firstQueue.isEmpty() && secondQueue.isEmpty();
    }
}
