package relative_ranks_506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * Method gets an array of athletes scores. All the scores are guaranteed to be unique.
     * The athletes are placed based on their scores,
     * where the 1st place athlete has the highest score,
     * the 2nd place athlete has the 2nd highest score, and so on.
     * The placement of each athlete determines their rank:
     * The 1st place athlete's rank is "Gold Medal".
     * The 2nd place athlete's rank is "Silver Medal".
     * The 3rd place athlete's rank is "Bronze Medal".
     * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
     *
     * @param score integer array score of size n, where score[i] is the score of the ith athlete in a competition
     * @return Return an array answer of size n where answer[i] is the rank of the ith athlete.
     * */
    public String[] findRelativeRanks(int[] score) {
        // create map where to each score is stored index of sportsman in array
        Map<Integer, Integer> scoresAndIndexes = new HashMap<>();

        // for each sportsman in array
        for (int i = 0; i < score.length; i++) {
            // put scores and index into array
            scoresAndIndexes.put(score[i], i);
        }

        // sort the array
        Arrays.sort(score);
        // create an empty array with length same with score
        String[] result = new String[score.length];
        // create variable that records place of the sportsman
        int place = 1;

        // traverse array backwards
        for (int i = score.length - 1; i >= 0; i--) {
            // gets index of current score
            int index = scoresAndIndexes.get(score[i]);

            // depending on place
            switch (place) {
                // if first place
                case 1 :
                    //set golden medal to player
                    result[index] = "Gold Medal";
                    break;
                // if second place
                case 2 :
                    //set silver medal to player
                    result[index] = "Silver Medal";
                    break;
                // if third place
                case 3 :
                    //set bronze medal to player
                    result[index] = "Bronze Medal";
                    break;
                // other places
                default :
                    // set just place
                    result[index] = Integer.toString(place);
                    break;
            }

            // increment place
            place++;
        }

        // return result array
        return result;
    }
}