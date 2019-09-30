import java.util.HashMap;
public class Exercise03 {
	public static void main(String[] args) {
		HashMap<Integer, String> daysOfTheWeek = new HashMap<Integer, String>();
		daysOfTheWeek.put(1,"Monday");
		daysOfTheWeek.put(2,"Tuesday");
		daysOfTheWeek.put(3,"Wednesday");
		daysOfTheWeek.put(4,"Thursday");
		daysOfTheWeek.put(5,"Friday");
		daysOfTheWeek.put(6,"Saturday");
		daysOfTheWeek.put(7,"Sunday");
		System.out.println("Please, input your wanted day of the week in digital form");
		int dayWanted = Integer.parseInt(System.console().readLine());
		System.out.println(daysOfTheWeek.get(dayWanted));
	}
}

