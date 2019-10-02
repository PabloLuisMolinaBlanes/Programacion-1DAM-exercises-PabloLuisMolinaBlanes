public class Exercise11 {
  public static void main(String[] args) {
    int hoursInputtedToSeconds;
    int minutesInputtedToSeconds;
    System.out.println("This program is thought to show you how many seconds last 'till midnight");
    System.out.println("Input the current hour");
    hoursInputtedToSeconds = Integer.parseInt(System.console().readLine()) * 3600;
    System.out.println("Input the current minutes");
    minutesInputtedToSeconds = Integer.parseInt(System.console().readLine()) * 60;
    int secondsTillMidnight = 86400;
    int differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds);
    if (differenceOfTime > 0) {
      System.out.println("There are " + differenceOfTime + " seconds 'till midnight");
    } else {
      System.out.println(Math.abs(differenceOfTime) + " seconds passed from this midnight to now");
    }
  }
}
    
