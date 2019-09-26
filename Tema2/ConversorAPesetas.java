public class ConversorAPesetas {
	static double euros = 34.45; 
	static double pesetas = 166; // The value of a Spanish Peseta in the 1970s compared to current euros, can be replaced for other values in different times(in the 1930s the value of a Spanish Peseta was equivalent to that of a current euro, for reference) 
	public static void main(String[] args) {
		double conversion = euros * pesetas;
		System.out.printf("%.3f %3s\n", conversion, "pts");
	}
}
		
