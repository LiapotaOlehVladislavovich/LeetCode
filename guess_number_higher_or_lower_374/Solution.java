package guess_number_higher_or_lower_374;

public class Solution extends GuessGame{
    public Solution(int numberToGuess) {
        super(numberToGuess);
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = left + (right - left) / 2;
        int guess = guess(mid);

        while (guess != 0) {
            if (guess == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            mid = left + (right - left) / 2;
            guess = guess(mid);
        }

        return mid;
    }
}
