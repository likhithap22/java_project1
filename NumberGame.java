import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        System.out.println("NUMBER GAME : ");

        do {
            int randomNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nselect a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < randomNumber)
                     {
                    System.out.println("Too Low!");
                }
                 else if (guess > randomNumber) {
                    System.out.println("Too High!");
                }
                 else 
                    {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);

                    score += (maxAttempts - attempts + 1);
                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Game Over!");
                System.out.println("The correct number: " + randomNumber);
            }

            System.out.println("Current Score: " + score);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nFinal Score: " + score);
        System.out.println("Thank you for playing!");

        // Close Scanner
        sc.close();
    }
}