public class Exercise04 {
	public static void main(String[] args) {
		int workedHours;
		int extraEurosPerHour = 16;
		int eurosPerHour = 12;
		System.out.println("This program is thought to calculate your salary in an euro per hour fashion");
		System.out.println("Now, please, input your number of worked hours, do not use decimals");
		workedHours = Integer.parseInt(System.console().readLine());
		if (workedHours <= 40) {
		System.out.println("You are bound to a payment of " + workedHours * eurosPerHour + " euros");
	}	 else {
			System.out.println("You are bound to a payment of " + ((40 * eurosPerHour) + ((workedHours - 40) * extraEurosPerHour)) + " euros");
		}
	}
}

