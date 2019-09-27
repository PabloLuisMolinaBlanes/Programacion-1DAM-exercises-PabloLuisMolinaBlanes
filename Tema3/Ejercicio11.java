public class Ejercicio11 {
	static double factorDeConversion = 1024; // 1 KB / 1/1024 MB
	static double kilobytes; 
	public static void main(String[] args) {
		System.out.println("Please, input your value in Kilobytes");
		kilobytes = Double.parseDouble(System.console().readLine());
		double totalMegabytes = kilobytes / factorDeConversion;
		System.out.printf("%.2f MB\n", totalMegabytes);
	}
}

