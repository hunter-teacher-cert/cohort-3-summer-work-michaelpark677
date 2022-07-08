/**
 * nth Fibonacci number generator by Team SumEmIfYaGotEm
  * Kate Maschmeyer
 * collaborators:
 * Alicia Wade
 * Marieke Thomas
 * Moo Joon Park
 */

public class Fib
{

  //your implementation of fib(n) here
  public static int fib(int n) {
    if(n == 0 || n == 1) {
      return n;
    }

    if(n > 1) {
      return fib(n-1) + fib(n-2);
    } 
    System.out.println("fib(n) not defined for negative integers!"); 
    return -1; //badness
  }
    



  public static void main( String[] args )
  {

      System.out.println( fib(0) ); // -> 0
      System.out.println( fib(1) ); // -> 1
      System.out.println( fib(2) ); // -> 1
      System.out.println( fib(3) ); // -> 2
      System.out.println( fib(4) ); // -> 3
      System.out.println( fib(5) ); // -> 5

      //now go big:
      System.out.println( fib(10) ); // -> 55
      System.out.println( fib(20) ); // -> 6765
      System.out.println( fib(40) ); // -> 102334155
     

  }//end main()

}//end class Fib