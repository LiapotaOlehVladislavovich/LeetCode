package minimum_number_of_moves_to_seat_everyone_2037;

import java.util.Arrays;

public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        //sort arrays
        Arrays.sort(seats);
        Arrays.sort(students);

        //create variable to store result
        int answer = 0;

        //for each seat and student in corresponding position
        for (int i = 0; i < seats.length; i++) {
            //increase answer to absolute value of it`s difference
            answer += Math.abs(seats[i] - students[i]);
        }

        return answer;
    }
}
