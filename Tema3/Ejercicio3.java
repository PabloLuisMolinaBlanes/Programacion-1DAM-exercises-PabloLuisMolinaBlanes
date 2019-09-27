public class Ejercicio3 {
	static double factorDeConversion = 166;
	static int pesetas; // One 1970 Spanish Peseta had the adquisitive power of the opposite of 1/166 a current euro, replace '166' for the worthof the peseta for one euro of another age.
	public static void main(String[] args) {
		System.out.println("Please, input your value in Spanish Peseta");
		pesetas = Integer.parseInt(System.console().readLine());
		double eurosTotales = pesetas / factorDeConversion;
		System.out.printf("%.2f eur\n", eurosTotales);
	}
}

