import java.util.Scanner;
public class Exercise06 {
	public static void main(String[] args) {
		int numeroAleatorio = (int) (Math.random()*100);
		int oportunidades = 5;
		int numeroPuesto = 0;
		Scanner respondedor = new Scanner(System.in);
		System.out.println("Adivina qu� n�mero pienso yo");
		while (oportunidades >= 1 || numeroPuesto == numeroAleatorio) {
			numeroPuesto = Integer.parseInt(respondedor.nextLine());
			if (numeroPuesto == numeroAleatorio) {
				System.out.println("Felicidades, ese era");
				System.exit(0);
			} else if (numeroPuesto < numeroAleatorio) {
				oportunidades--;
				System.out.println("Mi n�mero es mayor, te quedan " + oportunidades + " oportunidades");
				
			} else {
				oportunidades--;
				System.out.println("Mi n�mero es menor, te quedan " + oportunidades + " oportunidades");
			}	
		}
			System.out.println("Perdiste el juego");
	}
}
