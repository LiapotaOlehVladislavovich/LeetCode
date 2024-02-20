package keys_and_rooms_841;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> keys = new Stack<>();
        visited.add(0);
        keys.addAll(rooms.get(0));

        while (!keys.empty()) {
            int key = keys.pop();

            if (!visited.contains(key)) {
                visited.add(key);
                keys.addAll(rooms.get(key));
            }
        }

        return rooms.size() == visited.size();
    }
}
