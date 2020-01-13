
public class Exercise11 {
	public static void main(String[] args) {
		int nota = (int) ((Math.random()*10)+1);
		int numeroDeNotas = 20;
		int contadorDeNotas = 0;
		int contadorDeSuspensos = 0;
		int contadorDeSuficientes = 0;
		int contadorDeBien = 0;
		int contadorDeNotables = 0;
		int contadorDeSobresalientes = 0;
		while (contadorDeNotas <= numeroDeNotas) {
			if (nota < 5) {
				System.out.println("Suspenso");
				contadorDeSuspensos++;
			}
			if (nota >= 5 && nota < 6) {
				System.out.println("Suficiente");
				contadorDeSuficientes++;
			}
			if (nota >= 6 && nota < 7) {
				System.out.println("Bien");
				contadorDeBien++;
			}
			if (nota >= 7 && nota < 9) {
				System.out.println("Notable");
				contadorDeNotables++;
			}
			if (nota >= 9 && nota <= 10) {
				System.out.println("Sobresaliente");
				contadorDeSobresalientes++;
			}
			contadorDeNotas++;
			nota = (int) ((Math.random()*10)+1);
		}
		System.out.println("Tienes " + contadorDeSuspensos + " suspensos, " + contadorDeSuficientes + " suficientes, " + contadorDeBien + " bien, " + contadorDeNotables + " notables y " + contadorDeSobresalientes + " sobresalientes.");
	}
}
