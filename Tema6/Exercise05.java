
public class Exercise05 {
	public static void main(String[] args) {
		int numeroAleatorio = (int) (Math.random()*99)+100;
		int sumaDeNumeros = 0;
		int maximoActual = 0;
		int minimoActual = 199;
		for(int contador = 0; contador <= 50; contador++) {
			System.out.print(numeroAleatorio + " ");
			sumaDeNumeros += numeroAleatorio;
			numeroAleatorio = (int) ((Math.random()*99)+100);
			if (maximoActual < numeroAleatorio) {
				maximoActual = numeroAleatorio;
			}
			if (minimoActual > numeroAleatorio) {
				minimoActual = numeroAleatorio;
			}
			}
		System.out.println("");
		System.out.println("La media de los números es " + sumaDeNumeros/50);
		System.out.println("El número máximo es " + maximoActual);
		System.out.println("El número mínimo es " + minimoActual);
			}
		}

