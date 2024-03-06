package guess_number_higher_or_lower_374;

public class GuessGame {
    private final int numberToGuess;

    public GuessGame(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    protected int guess(int num) {
        return Integer.compare(numberToGuess, num);
    }
}
