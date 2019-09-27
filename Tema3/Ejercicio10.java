public class Ejercicio10 {
	static double factorDeConversion = 1024; // 1 MB / 1024 KB
	static double megabytes; 
	public static void main(String[] args) {
		System.out.println("Please, input your value in Megabytes");
		megabytes = Double.parseDouble(System.console().readLine());
		double totalKilobytes = megabytes * factorDeConversion;
		System.out.printf("%.2f KB\n", totalKilobytes);
	}
}

