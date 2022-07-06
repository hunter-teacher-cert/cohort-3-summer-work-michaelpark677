import java.util.Random;

public class Array {

  public static double powArray(double[] a, int pwr) {

    for(int i = 0; i < a.length; i++) {
      a[i] = Math.pow(a[i], pwr);
      
      System.out.print(a[i] + "  ");
      
    }
    System.out.println();
    return 0.0;
  }

  public static int histogram(int[] counts) {

    int scores;
    
    counts = new int[100];
    for (int i = 0; i < scores.length; i++) {
      int index = scores[i];
      counts[index]++;
      
    }
    return scores;
  }

  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
}

  
  public static void main (String[] args) {

    double [] a = {1, 2, 3, 4};

    powArray(a, 2);
  }
}