package insert_delete_getRandom_O1_380;

import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        return (int) set.toArray()[(int)(Math.random() * set.size())];
    }
}
