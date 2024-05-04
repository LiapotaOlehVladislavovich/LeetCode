package boats_to_save_people_881;

import java.util.Arrays;

public class Solution {
    /**
     * Method gets an array of people weights and weight limit of boat.
     * Boat can carry at most two people.
     * Method should return minimal number of boats.
     *
     * @param limit weight limit of boat
     * @param people array of people`s weight
     * @return minimal required number of boats
     * */
    public int numRescueBoats(int[] people, int limit) {
        // sort array
        Arrays.sort(people);
        //set two pointers
        int i = 0;
        int j = people.length - 1;
        // set boats counter
        int boats = 0;

        // while pointers point on two existent people
        while (i < j) {
            // if boat can carry two people
            if (people[i] + people[j] <= limit) {
                // set people with minimal weight in boat
                i++;
            }

            // set people with maximal weight in boat
            j--;
            // add boat to counter
            boats++;
        }

        // if remained one people
        if (i == j) {
            // add boat to counter
            boats++;
        }

        // return boat counter
        return boats;
    }
}