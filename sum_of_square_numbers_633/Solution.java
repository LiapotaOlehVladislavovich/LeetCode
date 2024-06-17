package sum_of_square_numbers_633;

public class Solution {
    public boolean judgeSquareSum(int c) {
        //create variable to store result
        boolean result = false;

        //for each possible a
        for (long a = 0; a * a <= c; a++) {
            //count corresponding b
            double b = Math.sqrt(c - a * a);

            //if b is perfect square
            if (b == (int) b) {
                //set result as true
                result = true;
                //end the cycle
                a = c + 1;
            }
        }

        return result;
    }
}