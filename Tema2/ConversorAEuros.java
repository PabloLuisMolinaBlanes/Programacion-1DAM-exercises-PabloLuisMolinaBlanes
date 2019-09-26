public class ConversorAEuros {
	static double pesetas = 166;
	static double euros = 1; // One 1970 Spanish Peseta had the adquisitive power of the opposite of 1/166 a current euro, replace '166' for the worthof the peseta for one euro of another age.
	public static void main(String[] args) {
		double eurosTotales = euros / pesetas;
		System.out.printf("%.3f %3s\n", eurosTotales," eur");
	}
}

