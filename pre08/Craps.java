import java.util.*;
import java.io.*;

public class Craps {

  public static int roll (int diceRoll) {

    Random random = new Random();
    int dice = random.nextInt(diceRoll+1);

    return dice;

  }
  
  public static int shoot (int numDice, int maxRoll) {

    Random random = new Random();
    int maxR = random.nextInt(maxRoll+1);

    return maxR;
    
  }

  public static void round() {

    int rollmax = 12;
    Random random = new Random();
    int roll = random.nextInt(rollmax);

    if (roll == 2 || roll == 3 || roll == 12) {
        System.out.println("You rolled a " + roll + ". That's Craps, you lose.");
    }
    else if (roll == 7 || roll == 12) {
        System.out.println("You rolled a " + roll + ". That's a Natural, you win.");
    }
  
    int point = roll;
    System.out.println(point);
    
    while (roll != point || roll != 7) {
        roll = random.nextInt(roll);
      }
    
    if (int roll == point) {
      System.out.println("You rolled the point " + point + "so ou win.");
    }
    else if (roll == 7) {
      System.out.println(" you rolled a 7, so you lose.");
    }

  }

  public static void main (String[] args) {

    int die = 9;
    System.out.println(roll(die));

    int numDice = 2;
    int max = numDice * 6;
    System.out.println(shoot(numDice, max));

    round();
  }
}