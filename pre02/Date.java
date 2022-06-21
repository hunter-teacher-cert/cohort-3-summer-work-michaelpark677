<<<<<<< HEAD
class Date {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println();

    String day;
    int date;
    String month;
    int year;

    day = "Friday";
    date = 17;
    month = "June";
    year = 2022;

    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    System.out.println();

    System.out.println("American format:");
    System.out.println(day + " " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
    System.out.println();
    
  }

=======
public class Date {
  public static void main(String[] args) {

    String day, month;
    int date, year;

    day = "Sunday";
    month = "June";
    date = 19;
    year = 2022;

    System.out.println(day);
    System.out.println(month);
    System.out.println(date);
    System.out.println(year);

    System.out.println("\nAmerican format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);

    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
    
  }
>>>>>>> origin/master
}