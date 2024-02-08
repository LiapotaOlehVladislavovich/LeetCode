package open_the_lock_752;

import java.util.*;

public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>(List.of(deadends));

        if (visited.contains("0000")) {
            return -1;
        }

        Queue<String> queue = new ArrayDeque<>();
        int counter = 0;
        queue.offer("0000");
        visited.add("0000");

        while (!queue.isEmpty()) {
            int currentQueueSize = queue.size();

            for (int i = 0; i < currentQueueSize; i++) {
                String code = queue.poll();

                if (code.equals(target)) {
                    return counter;
                }

                for (int j = 0; j < code.length(); j++) {
                    char[] codeInArray = code.toCharArray();
                    codeInArray[j] = (char) ((codeInArray[j] == 48) ? 57 : codeInArray[j] - 1);
                    String newCode = new String(codeInArray);

                    if (!visited.contains(newCode)) {
                        queue.add(newCode);
                        visited.add(newCode);
                    }

                    codeInArray = code.toCharArray();
                    codeInArray[j] = (char) ((codeInArray[j] == 57) ? 48 : codeInArray[j] + 1);
                    newCode = new String(codeInArray);

                    if (!visited.contains(newCode)) {
                        queue.add(newCode);
                        visited.add(newCode);
                    }
                }
            }

            counter++;
        }

        return -1;
    }
}
