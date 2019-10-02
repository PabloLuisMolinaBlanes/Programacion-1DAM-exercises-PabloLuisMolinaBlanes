import java.util.HashMap;
public class Exercise10 {
  public static void main(String[] args) { //This horoscope works as accorded by the Tropical Zodiac, it is easily interchargeable into another horoscope format such as the Siderial zodiac or into the dictated by the IAU boundaries, just replace the days where the zodiac sign changes and that should be it.
    HashMap<Integer, Integer> monthAndItsHoroscopeChangingDay = new HashMap<Integer, Integer>();
    monthAndItsHoroscopeChangingDay.put(1,20);
    monthAndItsHoroscopeChangingDay.put(2,19);
    monthAndItsHoroscopeChangingDay.put(3,21);
    monthAndItsHoroscopeChangingDay.put(4,20);
    monthAndItsHoroscopeChangingDay.put(5,21);
    monthAndItsHoroscopeChangingDay.put(6,21);
    monthAndItsHoroscopeChangingDay.put(7,23);
    monthAndItsHoroscopeChangingDay.put(8,23);
    monthAndItsHoroscopeChangingDay.put(9,23);
    monthAndItsHoroscopeChangingDay.put(10,23);
    monthAndItsHoroscopeChangingDay.put(11,22);
    monthAndItsHoroscopeChangingDay.put(12,22);
    HashMap<Integer, Integer> lastDayOfTheMonth = new HashMap<Integer, Integer>();
    lastDayOfTheMonth.put(1,31);
    lastDayOfTheMonth.put(2,28);
    lastDayOfTheMonth.put(3,31);
    lastDayOfTheMonth.put(4,30);
    lastDayOfTheMonth.put(5,31);
    lastDayOfTheMonth.put(6,30);
    lastDayOfTheMonth.put(7,31);
    lastDayOfTheMonth.put(8,31);
    lastDayOfTheMonth.put(9,30);
    lastDayOfTheMonth.put(10,31);
    lastDayOfTheMonth.put(11,30);
    lastDayOfTheMonth.put(12,31);
    HashMap<Integer, String> signPerMonth = new HashMap<Integer, String>();
    signPerMonth.put(1,"Capricorn");
    signPerMonth.put(2,"Aquarius");
    signPerMonth.put(3,"Pisces");
    signPerMonth.put(4,"Aries");
    signPerMonth.put(5,"Taurus");
    signPerMonth.put(6,"Gemini");
    signPerMonth.put(7,"Cancer");
    signPerMonth.put(8,"Leo");
    signPerMonth.put(9,"Virgo");
    signPerMonth.put(10,"Libra");
    signPerMonth.put(11,"Scorpio");
    signPerMonth.put(12,"Sagittarius");
    signPerMonth.put(13,"Capricorn");
    System.out.println("This program is thought to show your horscope symbol as dictated by the Tropical Zodiac");
    System.out.println("Please, input the month you were bornt in");
    int monthShown = Integer.parseInt(System.console().readLine());
    System.out.println("Now, input the day you were bornt in");
    int dayShown = Integer.parseInt(System.console().readLine());
    int horoscopeChangingDay = monthAndItsHoroscopeChangingDay.get(monthShown);
    int lastDayOfMonth = lastDayOfTheMonth.get(monthShown);
    if (dayShown <= horoscopeChangingDay) {
        if (dayShown > lastDayOfMonth) {
          System.out.println("Error, invalid day");
      } else {
          System.out.println("Your symbol is " + signPerMonth.get(monthShown)); 
        }
    } else if (dayShown > horoscopeChangingDay) {
        if (dayShown > lastDayOfMonth) {
          System.out.println("Error, invalid day");
      } else {
          System.out.println("Your symbol is " + signPerMonth.get(monthShown + 1)); 
        }
      }
    }
  }
      

