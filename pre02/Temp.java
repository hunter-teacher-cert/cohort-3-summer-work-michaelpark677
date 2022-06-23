import java.util.Scanner;
/**
 * Converts temperatures from Celsius to Fahrenheit.
 */
public class Temp {

  public static void main(String[] args) {

    double celsius, fahrenheit;
    Scanner in = new Scanner(System.in);

    //Prompts the user to enter a temperature value in Celsius
    System.out.print("Enter the temperature in celsius: ");
    celsius = in.nextDouble();

    //Converts and outputs the value in Fahrenheit
    fahrenheit = celsius * (9.0/5.0) + 32;
    System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    
  }
}