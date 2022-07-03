import java.util.Scanner;
import java.io.*;

public class Methods {

  public static boolean isDivisible(int nn, int mm) {

    if(nn % mm == 0) {
        return true;
    }  else {
        return false;
    }
  }
  
  public static void main (String[] args) {

    int n, m, a, b, c;
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input value for n: ");
    n = in.nextInt();
    System.out.print("Input value for m: ");
    m = in.nextInt();

    System.out.print("You entered: " + n + " for n");
    System.out.println(" and " + m + " for m.");

    System.out.println(isDivisible (n, m));


    System.out.print("Input value for a: ");
    a = in.nextInt();
    System.out.print("Input value for b: ");
    b = in.nextInt();
    System.out.print("Input value for c: ");
    c = in.nextInt();
    System.out.println(isTriangle (a, b, c));


    
    System.out.print("Input value for m: ");
    m = in.nextInt();
    System.out.print("Input value for n: ");
    n = in.nextInt();
    System.out.println(ack(m, n));
  
  }



  public static boolean isTriangle(int aa, int bb, int cc) {

    if (aa > bb + cc || bb > aa + cc || cc > aa + bb) {
        return false;
    }  else {
        return true;
    }
  }


  public static int ack (int m1, int n1) {

    if (m1 = 0) {
          return (n1 + 1);
    }   else if (m1 > 0 && n1 == 0); {
          return ack(m1 -1, 1);
    }   else if (m1 > 0 && n1 > 0);  {
          return ack(m1 - 1, ack(m1, n1 -1));
    }   
  }
  
}