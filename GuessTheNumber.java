import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int numberToGuess;
    private int numberOfTries;
    private static final int MAX_TRIES = 5;

    // Constructor
    public GuessTheNumber() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        this.numberOfTries = 0;
    }

    // Method to start the game
    public void startGame() {
        System.out.println("Welcome to Guess the Number!");
        System.out.println("You have " + MAX_TRIES + " tries to guess the number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        while (numberOfTries < MAX_TRIES && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            numberOfTries++;

            if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your tries. The number was: " + numberToGuess);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.startGame();
    }
}
