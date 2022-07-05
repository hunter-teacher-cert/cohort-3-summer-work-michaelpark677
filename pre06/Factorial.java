import java.util.Scanner;

public class Factorial {
  
  public static int factorial (int n) {

  int ans = 1;

  for (int i = 1; i <= n; i++) {
      ans = ans * i;
    }
    return ans;
  } 
  
  public static void main (String[] args) {

    int n;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter a value to compute its factorial: ");
    n = in.nextInt();

    System.out.println(factorial(n));
      
  }
}
