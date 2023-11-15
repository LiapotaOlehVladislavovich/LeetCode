package plus_one_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int [] newDigitsArray = new int[digits.length];
        int rememberDigit = 0;
        int currentNumber;
        int lastIndex = digits.length - 1;

        currentNumber = rememberDigit + digits[lastIndex] + 1;
        newDigitsArray[lastIndex] = currentNumber % 10;
        rememberDigit = currentNumber / 10;

        for (--lastIndex; lastIndex >= 0; lastIndex--) {
            currentNumber = rememberDigit + digits[lastIndex];
            newDigitsArray[lastIndex] = currentNumber % 10;
            rememberDigit = currentNumber / 10;
        }

        int[] temporalArray;

        if (rememberDigit == 1) {
            temporalArray = new int[newDigitsArray.length + 1];
            temporalArray[0] = rememberDigit;
            System.arraycopy(newDigitsArray, 0, temporalArray, 1, newDigitsArray.length);
            newDigitsArray = temporalArray;
        }

        return newDigitsArray;
    }
}
