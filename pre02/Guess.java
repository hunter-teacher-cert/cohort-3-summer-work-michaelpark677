import java.util.Random;
import java.util.Scanner;

/**
 * This program generates a random number and compares it to a user input value.
 * It will compare the two numbers and state how far off the user's guess was.
*/
public class Guess {

    public static void main(String[] args) {

        int guess;
        Scanner in = new Scanner(System.in);
        
      // Picks a random number using a random number generator
        Random random = new Random();
        int number = random.nextInt(100) + 1;

      //Asks user to guess the number and outputs the guess
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);

      //Reveals the random number and how far off the user's guess was
        System.out.println("The number I was thinking of was: " + number);
        System.out.println("You were off by: " + Math.abs(guess - number));
      
    }
}