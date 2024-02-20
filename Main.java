import keys_and_rooms_841.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> room0 = new ArrayList<>();
        room0.add(1);
        List<Integer> room1 = new ArrayList<>();
        room1.add(2);
        List<Integer> room2 = new ArrayList<>();
        room2.add(3);
        List<Integer> room3 = new ArrayList<>();
        test.add(room0);
        test.add(room1);
        test.add(room2);
        test.add(room3);
        new Solution().canVisitAllRooms(test);
    }
}