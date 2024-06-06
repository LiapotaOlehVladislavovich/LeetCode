package hand_of_straights_846;

import java.util.Arrays;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //create variable to store result
        boolean answer = true;

        //hand can`t be divided on groups of designated size
        if (hand.length % groupSize != 0) {
            //set result as false
            answer = false;
        } else {
            //sort given hand
            Arrays.sort(hand);

            //for each card in hand
            for (int i = 0; i < hand.length; i++) {
                //if card is present in hand
                if (hand[i] != -1) {
                    //set next card for straight hand
                    int nextCard = hand[i] + 1;
                    //remove current card from hand
                    hand[i] = -1;
                    //decrement number of required size
                    int remainingLength = groupSize - 1;

                    //for each card while group isn`t complete, or reached the end of hand
                    for (int j = i + 1; j < hand.length && remainingLength > 0; j++) {
                        //if card is bigger than required for a straight group
                        if (hand[j] > nextCard) {
                            //set result as false
                            answer = false;
                            //end both cycles
                            j = hand.length;
                            i = hand.length;
                            //if card is equal to required for a straight group
                        } else if (hand[j] == nextCard) {
                            //remove card from the hand
                            hand[j] = -1;
                            //decrement number of required size
                            remainingLength--;
                            //increment value for a next required card
                            nextCard++;
                        }
                    }

                    //if group is not complete
                    if (remainingLength > 0) {
                        //set result as false
                        answer = false;
                    }
                }
            }
        }

        //return result
        return answer;
    }
}