import java.util.concurrent.ThreadLocalRandom;


/** I found this file online and was testing it see how the code works. This is NOT MY PROJECT FOR SUBMISSION. I have given credit to the author below.
--MOO JOON PARK


/**
 * Plays the game of Craps. The player rolls a pair of dice. If the 
 * sum is 7 or 11, the player wins, and if it is 2, 3, or 12 then the 
 * player loses. In any other case, the player keeps rolling until 
 * obtaining the first sum (WINS) or a sum of 7 (LOSES).
 *
 * @author Drue Coles
 */
public class TestCraps {

   public static void main(String[] args) {
      ThreadLocalRandom rand = ThreadLocalRandom.current();

      // first roll
      int die1 = rand.nextInt(1, 7);
      int die2 = rand.nextInt(1, 7);
      final int firstSum = die1 + die2;
      System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

      // Check if player wins or loses on first roll.
      if (firstSum == 7 || firstSum == 11) {
         System.out.println("You win.");
         return;
      }
      if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
         System.out.println("You lose.");
         return;
      }

      // The player did not win or lose on the first roll, so keep 
      // rolling until the new sum matches the first one or is equal 
      // to 7.
      int newSum = 0;
      while (newSum != firstSum && newSum != 7) {
         die1 = rand.nextInt(1, 7);
         die2 = rand.nextInt(1, 7);
         newSum = die1 + die2;
         System.out.printf("%d + %d = %d %n", die1, die2, newSum);
      }

      if (newSum == firstSum) {
         System.out.println("You win.");
      } else {
         System.out.println("You lose.");
      }
   }
}