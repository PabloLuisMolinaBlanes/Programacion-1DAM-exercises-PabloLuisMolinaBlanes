package Tema9;

public class Revista extends Inventario {
	int tomo;
	public Revista(String n, String c, int a, int t) {
		super(n, c, a);
		this.tomo = t;
	}
	public String toString() {
		String end = this.estaPrestado() ? ")" : "no prestado)";
		return "ISBN " + this.getCodigo() + " titulo - " + this.getNombre() + " ano de publicacion " + this.getAno() + " tomo - " + this.tomo +  " (" + end;
		
	}
}
