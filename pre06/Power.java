public class Power {

  public static double power (double x, int n) {

    double ans = 1;
    
    for(int i = 0; i < n; i++) {

      ans = ans * x;
    }

    return ans;
  }

  public static void main (String[] args) {

    double x = 4;
    int n = 5;
    
    System.out.print(x + " to the power of ");
    System.out.println(n + " is "+ power (x, n));

  }
}