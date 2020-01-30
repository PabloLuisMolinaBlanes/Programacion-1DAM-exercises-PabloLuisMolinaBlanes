package Tema9;

public class Ameba {
	int peso;
	public Ameba() {
		this.peso = 3;
	}
	public void come(int p) {
		this.peso += p - 1;
	}
	public void come(Ameba a) {
		this.peso += a.peso - 1;
		a.peso = 0;
	}
	public String toString() {
		return "Soy una ameba y peso " + this.peso + " microgramos";
	}
	
}
