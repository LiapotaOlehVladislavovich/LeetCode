package design_circular_queue_622;

public class MyCircularQueue {
    private final int[] queueStorage;
    private int head;
    private int tail;

    public MyCircularQueue(int k) {
        queueStorage = new int[k];
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (head == -1) {
            head = 0;
            tail = 0;
            queueStorage[tail] = value;
            return true;
        }

        if (isFull()) {
            return false;
        }

        tail = getNextTail();
        queueStorage[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }

        head = (head == queueStorage.length - 1) ? 0 : head + 1;
        return true;
    }

    public int Front() {
        return (head == -1) ? -1 : queueStorage[head];
    }

    public int Rear() {
        return (tail == -1) ? -1 : queueStorage[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return getNextTail() == head;
    }

    private int getNextTail() {
        return (tail == queueStorage.length - 1) ? 0 : tail + 1;
    }
}
