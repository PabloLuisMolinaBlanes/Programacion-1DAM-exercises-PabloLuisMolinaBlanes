package Tema9;

public class initTiempo {

	public static void main(String[] args) {
		Tiempo tiempo = new Tiempo(10, 35, 5);
		Tiempo tiempo2 = new Tiempo(2,60,30);
		Tiempo tiempo3 = new Tiempo(1,60,30);
		System.out.println(tiempo2);
		tiempo2.suma(tiempo3);
		System.out.println(tiempo2);
	}

}
