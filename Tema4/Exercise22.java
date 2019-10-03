public class Exercise22 {
  public static void main(String[] args) {
    int hoursInputtedToSeconds;
    int minutesInputtedToSeconds;
    System.out.println("This program is thought to show you how many seconds last 'till weekend");
    System.out.println("Input the current hour");
    hoursInputtedToSeconds = Integer.parseInt(System.console().readLine()) * 3600;
    System.out.println("Input the current minutes");
    minutesInputtedToSeconds = Integer.parseInt(System.console().readLine()) * 60;
    System.out.println("Input the current day");
    String currentDay = System.console().readLine();
    int secondsTillMidnight = 399600;
    int differenceOfTime = 0;
    switch (currentDay) {
      case "lunes":
      differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds);
      break;
      case "martes":
      differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds + 86400);
      break;
      case "miercoles":
      differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds + 86400 * 2);
      break;
      case "jueves":
      differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds + 86400 * 3);
      break;
      case "viernes":
      differenceOfTime = secondsTillMidnight - (hoursInputtedToSeconds + minutesInputtedToSeconds + 86400 * 4);
      break;
    }
    if (differenceOfTime > 0) {
      System.out.println("There are " + differenceOfTime + " seconds 'till weekend");
    } else {
      System.out.println(Math.abs(differenceOfTime) + " seconds passed from this weekend to now");
    }
  }
}
    
