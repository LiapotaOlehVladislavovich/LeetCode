package min_stack_155;

import java.util.LinkedList;
import java.util.List;

public class MinStack {
    private final List<Integer> bucket;
    private int minIndex;
    private int minValue;

    public MinStack() {
        bucket = new LinkedList<>();
        minIndex = -1;
        minValue = Integer.MAX_VALUE;
    }

    public void push(int val) {
        bucket.add(val);

        if (val <= minValue) {
            minValue = val;
            minIndex = bucket.size()-1;
        }
    }

    public void pop() {
        bucket.remove(bucket.size() - 1);

        if (bucket.size() == minIndex) {
            minValue = Integer.MAX_VALUE;

            for (int i = 0; i < bucket.size(); i++) {
                int current = bucket.get(i);

                if (current <= minValue) {
                    minIndex = i;
                    minValue = current;
                }
            }
        }
    }

    public int top() {
        return bucket.get(bucket.size()-1);
    }

    public int getMin() {
        return bucket.get(minIndex);
    }
}