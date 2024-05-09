package maximize_happiness_of_selected_children_3075;

import java.util.Arrays;

public class Solution {
    /**
     * There are n children standing in a queue, where the ith child has happiness value happiness[i].
     * You want to select k children from these n children in k turns.
     * In each turn, when you select a child,
     * the happiness value of all the children that have not been selected till now decreases by 1.
     * Note that the happiness value cannot become negative and gets decremented only if it is positive.
     *
     * @param happiness array of length n
     * @param k turns
     * @return maximum sum of the happiness values of the selected children you can achieve by selecting k children.
     * */
    public long maximumHappinessSum(int[] happiness, int k) {
        //sort array in ascending order
        Arrays.sort(happiness);
        //count maximum index value
        int indexMaximum = happiness.length - 1;
        //happiness counter
        long maxHappiness = 0;

        //for last k children
        for (int i = indexMaximum; i >= indexMaximum - k + 1; i--) {
            //decrease happiness of this child by number of previous children
            int currentHappiness = happiness[i] - (indexMaximum - i);

            //if happiness become less then 0
            if (currentHappiness < 0) {
                //stop the cycle
                i = indexMaximum - k;
            } else {
                //increase max happiness by current children happiness
                maxHappiness += currentHappiness;
            }
        }

        //return max happiness
        return maxHappiness;
    }
}