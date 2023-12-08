package design_hashMap_706;

public class MyHashMap {
    private final Integer[] buckets;

    public MyHashMap() {
        buckets = new Integer[1000001];
    }

    public void put(int key, int value) {
        buckets[key] = value;
    }

    public int get(int key) {
        Integer value = buckets[key];
        return (value == null) ? -1 : value;
    }

    public void remove(int key) {
        buckets[key] = null;
    }
}
