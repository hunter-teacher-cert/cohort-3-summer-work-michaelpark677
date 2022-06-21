<<<<<<< HEAD
class Time {
  public static void main(String[] args) {

    int hour, minute, second, totalSecMid, totalSecLeft, percentDayPassed, elapsedTime;

    hour = 13;
    minute = 4;
    second = 2;
    
    totalSecMid = (hour * 3600 + minute * 60 + second);
    System.out.println();
    System.out.println("Since midnight, " + totalSecMid + " seconds have elapsed.");

    totalSecLeft = (86400 - totalSecMid);
    System.out.println();
    System.out.println("There are " + totalSecLeft + " seconds left in the day.");

    percentDayPassed = (100 * totalSecMid/86400);
    System.out.println();
    System.out.println("Approximately " + percentDayPassed + "% of the day has passed.");

    hour = 13;
    minute = 37;
    second = 25;

    elapsedTime = ((hour * 3600 + minute * 60 + second) - totalSecMid);
    System.out.println();
    System.out.print("Approximately " + elapsedTime + " seconds have elapsed ");
    System.out.println("since I started working on this exercise.");
    System.out.println();

=======
public class Time {
  public static void main(String[] args) {

    int hour, minute, second, secSinceMid, secLeft, elapsedTime;
    double percentLeft;

    hour = 12;
    minute = 36;
    second = 53;

    secSinceMid = (hour * 3600 + minute * 60 + second);
    System.out.println("\nNumber of seconds since midnight: " + secSinceMid);

    secLeft = (86400 - secSinceMid);
    System.out.println("\nNumber of seconds left in the day: " + secLeft);

    percentLeft = (100 * secLeft/86400);
    System.out.println("\nPercent of the day left: " + percentLeft);

    hour = 12;
    minute = 50;
    second = 58;

    elapsedTime = (hour * 3600 + minute * 60 + second - secSinceMid);
    System.out.println("\nElapsed time(sec) since I started working on this assignment: "  + elapsedTime);

    
>>>>>>> origin/master
  }
}