public class Ejercicio7 {
	static int numeroDeProductos;
	static double precioDeProductos;
        static double currentIVA = 0.21; // (Current percentage of IVA)/100	
	public static void main(String[] args) {
	System.out.println("Please, specify the number of products");
	numeroDeProductos = Integer.parseInt(System.console().readLine());
	System.out.println("Please, specify the price for all products");
	precioDeProductos = Double.parseDouble(System.console().readLine());	
	double baseImponible = numeroDeProductos * (double) precioDeProductos;
	double iva = baseImponible * currentIVA;
	double total = baseImponible + iva;	
	System.out.printf("%.2f" + " eur" + " is your total\n", total);
	}
}
