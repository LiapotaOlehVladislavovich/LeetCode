import kth_largest_element_in_a_stream_703.KthLargest;

public class Main {
    public static void main(String[] args) {
        KthLargest test = new KthLargest(3, new int[]{4, 5, 8, 2});
        int testVal = test.add(3);
        testVal = test.add(5);
        testVal = test.add(10);
        testVal = test.add(9);
        testVal = test.add(4);
    }
}