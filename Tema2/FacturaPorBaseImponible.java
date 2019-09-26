public class FacturaPorBaseImponible {
	static int numeroDeProductos = 8;
	static double precioDeProductos = 5; 
	public static void main(String[] args) {
	double baseImponible = numeroDeProductos * (double) precioDeProductos;

	System.out.println(baseImponible + " eur");
	}
}
