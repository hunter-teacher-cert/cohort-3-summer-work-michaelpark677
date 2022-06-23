public class Exercise {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }

}

/**
  * The output of this program is as follows:
  * No, I wug.
  * You wugga wug.
  * I wug.
  *
  * The program starts at main and prints
  * "No, I " Then, the method zoop is called,
  * and inside zoop, the method baffle is called.
  * baffle outputs "wug", then ping is called,
  * which prints a period "."
  * Then, line 5 executes to print "You wugga ",
  * baffle is called to print "wug" then ping for "."
  * The program goes back to main to line 12 and prints "I",
  * calls baffle to print "wug", and finally to ping for "."
  *
  *Stack diagram:
  *
  * main    "No, I "
  * zoop    (baffle)
  * baffle  "wug"
  * ping    "."
  *
  * If you invoke baffle at the end of the ping method,
  * it will be an infinite loop where ".", then "wug" will
  * be printed continuously. The two methods will execute
  * back and forth continously.
  *
  */