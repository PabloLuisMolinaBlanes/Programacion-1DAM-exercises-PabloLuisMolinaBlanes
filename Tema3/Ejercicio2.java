public class Ejercicio2 {
	static double euros; 
	static int factorDeConversion = 166; // The value of a Spanish Peseta in the 1970s compared to current euros, can be replaced for other values in different times(in the 1930s the value of a Spanish Peseta was equivalent to that of a current euro, for reference) 
	public static void main(String[] args) {
		System.out.println("Introduzca los euros");
		euros = Double.parseDouble(System.console().readLine());
		double conversion = euros * factorDeConversion;
		System.out.printf("%.0f pts\n", conversion);
	}
}
		
