public class Exercise06 {
	public static void main(String[] args) {
		try {
		System.out.println("This program will find the time an object takes to fall to the ground using the Earth gravity as a reference point");
		double gravity = 9.81;
		System.out.println("Please, input the value for height");
		double height = Double.parseDouble(System.console().readLine());
		double time = Math.pow((2*height)/gravity, 1.0/2.0);
		if (gravity != 0) {
		System.out.printf("The solution is %.2f units of time\n", time);
		} else {
		System.out.println("There is no solution for the time it will take");
		}
		} catch (ArithmeticException ex) {
		System.out.println("There is no solution for x");

	        
	}
    }
}   

