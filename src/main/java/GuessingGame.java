import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I am thinking of a number between 1 and 100.");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        int number = rand.nextInt(101);
        boolean run = true;
        int guess;
        do
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > number)
            {
                System.out.println("Too high! Try again.");
            }
            if (guess < number)
            {
                System.out.println("Too low! Try again.");
            }
        }
        while (guess != number);
        System.out.println("You got it!");

        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
