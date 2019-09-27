public class Ejercicio08 {
	public static void main(String[] args) {
		int workedHours;
		int eurosPerHour = 12;
		System.out.println("This program is thought to calculate your salary in an euro per hour fashion");
		System.out.println("Now, please, input your number of worked hours, do not use decimals");
		workedHours = Integer.parseInt(System.console().readLine());
		System.out.println("You are bound to a payment of " + workedHours * eurosPerHour + " euros");
	}
}

