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

  }
}