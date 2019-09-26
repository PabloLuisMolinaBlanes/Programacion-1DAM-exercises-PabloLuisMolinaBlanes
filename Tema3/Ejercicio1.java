public class Ejercicio1 {
	static int number1;
	static int number2;
	public static void main(String[] args) {
		try {
			System.out.println("Please, tell me a number");
			 number1 = Integer.parseInt(System.console().readLine());
		} catch (NumberFormatException ex) {
			System.out.println("That is not a number, please, print a number");
			number1 = Integer.parseInt(System.console().readLine());
		} 
		try {
		System.out.println("Tell me another number");
		 number2 =  Integer.parseInt(System.console().readLine());
		} catch (NumberFormatException ex) {
			System.out.println("That is not a number, please, print a number");
			number1 = Integer.parseInt(System.console().readLine());
                } 
		int multiplication = number1 * number2;
		System.out.println("The result of their multiplication is " + multiplication);
	}
}


