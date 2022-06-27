import java.io.*;
import java.util.*;

public class Beer {

  public static void sing(int n) {

    if (n > 0) {
      
      System.out.println();
      System.out.println(n + " bottles of beer on the wall,");
      System.out.println(n + " bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      System.out.println(n + " bottles of beer on the wall.");

    sing(n - 1);
      
    } else {
      
      System.out.println();
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
      System.out.println("’cause there are no more bottles of beer on the wall!");
      System.out.println();
      
    }
  }
  
  public static void main (String[] args) {

    int n = 99;

    sing(n);
    
  }
}