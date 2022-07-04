import java.util.Scanner;

public class Root {


  public static double squareRoot(double a) {

    double x0 = a/2;
    double x1 = 0, diff = 2;
    
      while (diff > 0.0001) {
      System.out.println(x0);
      x1 = (x0 + (a/x0))/2;
      //System.out.println(x1);
      diff = Math.abs(x1 - x0);
      System.out.println(diff);

      x0 = x1;
        }
    return x0;
    
  }

  
  public static void main (String[] args) {

    double a=0;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter value to find the square root of: ");
    a = in.nextDouble();
    
    squareRoot(a);

  }
  
}