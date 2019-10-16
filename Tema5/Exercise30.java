import java.util.HashMap;
public class Exercise30 {
  public static void main(String[] args) {
        System.out.println("Hour difference finder");
        System.out.println("**************************");
        while (true) {
        try {
          System.out.print("Input the 1st day: ");
          String firstDay = System.console().readLine();
          System.out.println("");
          System.out.print("Input the 1st hour: ");
          int firstHour = Integer.parseInt(System.console().readLine());
          System.out.println("");
          System.out.print("Input the 2nd day: ");
          String secondDay = System.console().readLine();
          System.out.println("");
          System.out.print("Input the 2nd hour: ");
          int secondHour = Integer.parseInt(System.console().readLine());
          System.out.println("");
          try {
            if (Integer.parseInt(firstDay) > Integer.parseInt(secondDay)) {
              System.out.println("The first day cannot be bigger than the second");
            } else {
            int hoursLeft = Math.abs((((Integer.parseInt(firstDay) * 24) + firstHour) - ((Integer.parseInt(secondDay) * 24) + secondHour)));
            System.out.println("The hours left are " + hoursLeft + " hours to reach said hour");
            System.exit(0);
          }
          } catch (NumberFormatException ex) {
            HashMap<String, Integer> dayList = new HashMap<String, Integer>();
            dayList.put("lunes", 0);
            dayList.put("martes", 1);
            dayList.put("miércoles", 2);
            dayList.put("jueves", 3);
            dayList.put("viernes", 4);
            dayList.put("sábado", 5);
            dayList.put("domingo", 6);
            int firstDayToInt = dayList.get(firstDay.toLowerCase());
            int secondDayToInt = dayList.get(secondDay.toLowerCase());
            if (firstDayToInt > secondDayToInt) {
              System.out.println("The first day cannot be bigger than the second");
              System.out.println("");
            } else {
            int hoursLeft = Math.abs((((firstDayToInt * 24) + firstHour) - ((secondDayToInt * 24) + secondHour)));
            System.out.println("The hours left are " + hoursLeft + " hours to reach said hour");
            System.exit(0);
        } } 
        } catch (NumberFormatException ex1) {
          System.out.println("Incorrect hour input somewhere, try not to input values in other types than the expected.");
          System.out.println("");
        } catch (NullPointerException ex1) {
          System.out.println("Incorrect day input somewhere, please, input it again.");
          System.out.println("");
        }
      }
    }
  }
