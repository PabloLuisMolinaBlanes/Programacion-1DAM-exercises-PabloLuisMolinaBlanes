public class Ejercicio4 {
	static int x;
	static int y;
	public static void main(String[] args) {
		System.out.println("Please, input value for 'x'");
		x = Integer.parseInt(System.console().readLine());
		System.out.println("Please, input value for 'y'");
    y = Integer.parseInt(System.console().readLine());
		int suma = x + y;
		int resta1 = x - y;
		int resta2 = y - x;
		double division1 = (double) x / (double) y;
		double division2 = (double) y / (double) x;
    int multiplicacion = x * y;
		System.out.println("The sum is " + suma + ", The first substraction (x-y) is " + resta1 + ", The second substraction (y-x) is " + resta2 + ", The first division (x/y) is " + division1 + ", The second division (y/x) is " + division2 + " and the multiplication is " + multiplicacion);
		}
}	
			
