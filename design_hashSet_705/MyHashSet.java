package design_hashSet_705;

public class MyHashSet {
    boolean[] buckets;

    public MyHashSet() {
        buckets = new boolean[1000001];
    }

    public void add(int key) {
        buckets[key] = true;
    }

    public void remove(int key) {
        buckets[key] = false;
    }

    public boolean contains(int key) {
        return buckets[key];
    }
}
