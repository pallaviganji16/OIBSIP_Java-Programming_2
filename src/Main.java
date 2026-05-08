import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int rounds = 3;

        System.out.println("===== GUESS THE NUMBER GAME =====");


        for (int round = 1; round <= rounds; round++) {

            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + round);
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it.");


            while (attemptsLeft > 0) {

                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();

                attemptsLeft--;

                if (userGuess == numberToGuess) {

                    guessedCorrectly = true;

                    System.out.println("Congratulations! You guessed the number correctly.");


                    int roundScore = attemptsLeft * 10;
                    totalScore += roundScore;

                    System.out.println("You earned " + roundScore + " points.");
                    break;

                } else if (userGuess > numberToGuess) {

                    System.out.println("Too high! Try again.");

                } else {

                    System.out.println("Too low! Try again.");
                }

                if (attemptsLeft > 0) {
                    System.out.println("Attempts left: " + attemptsLeft);
                }
            }


            if (!guessedCorrectly) {
                System.out.println("You lost this round.");
                System.out.println("The correct number was: " + numberToGuess);
            }
        }


        System.out.println("\n===== GAME OVER =====");
        System.out.println("Your Total Score: " + totalScore);

        sc.close();
    }
}
