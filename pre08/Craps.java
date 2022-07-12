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

  public static 
  
  
  public static void main (String[] args) {

    int die = 9;
    System.out.println(roll(die));

    int numDice = 2;
    int max = numDice * 6;
    System.out.println(shoot(numDice, max));
    
  }
}