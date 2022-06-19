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

    
  }
}