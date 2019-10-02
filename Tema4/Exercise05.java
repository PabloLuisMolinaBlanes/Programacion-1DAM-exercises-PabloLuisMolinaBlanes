public class Exercise05 {
	public static void main(String[] args) {
		try {
		System.out.println("Please, input the value for 'a' in ax");
		double a = Double.parseDouble(System.console().readLine());
		System.out.println("Now input the value of the constant 'b' in ax + b");
		double b = Double.parseDouble(System.console().readLine());
		double x = -b/a;
		if (a != 0) {
		System.out.printf("The solution is %.2f ", x);
		} else {
		System.out.println("There is no solution for x");
		}
		} catch (ArithmeticException ex) {
		System.out.println("There is no solution for x");

	        
	}
}	

