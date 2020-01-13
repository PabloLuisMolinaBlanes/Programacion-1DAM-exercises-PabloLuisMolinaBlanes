
public class Exercise19 {
	public static void main(String[] args) {
		int numeroAleatorio = (int) (Math.random()*300)-200;
		int sumaDeNumeros = 0;
		int maximoActual = 0;
		int minimoActual = 199;
		for(int contador = 0; contador <= 50; contador++) {
			System.out.print(numeroAleatorio + " ");
			sumaDeNumeros += numeroAleatorio;
			numeroAleatorio = (int) (Math.random()*301)-200;
			if (maximoActual < numeroAleatorio && numeroAleatorio % 2 == 0) {
				maximoActual = numeroAleatorio;
			}
			if (minimoActual > numeroAleatorio && numeroAleatorio % 2 != 0) {
				minimoActual = numeroAleatorio;
			}
			}
		System.out.println("");
		System.out.println("La media de los números es " + sumaDeNumeros/50);
		System.out.println("El número máximo de los pares es " + maximoActual);
		System.out.println("El número mínimo de los impares es " + minimoActual);
			}
		}