package Tema9;
import java.util.Scanner;
public class initFraccion {

	public static void main(String[] args) {
		Fraccion fraccion = new Fraccion(6.0,3.0);
		Scanner textParser = new Scanner(System.in);
		do {
		System.out.println("Menu de Fraccion");
		System.out.println("----------------");
		System.out.println("1. Mostrar fraccion");
		System.out.println("2. Dividir");
		System.out.println("3. Multiplicar fraccion");
		System.out.println("4. Salir");
		System.out.println("5. Invertir");
		int option = textParser.nextInt();
		switch (option) {
		case 1:
			System.out.print(fraccion);
			break;
		case 2:
		System.out.println(fraccion.divide());
		break;
		case 3:
			System.out.println("Ponga numerador");
			double numerador = textParser.nextDouble();
			System.out.println("Ponga denominador");
			double denominador = textParser.nextDouble();
			Fraccion fraccionsegunda = new Fraccion(numerador,denominador);
			fraccion.multiplica(fraccionsegunda);
			System.out.println("Su resultado es: ");
			System.out.println(fraccion);
			break;
		case 4:
			System.out.println("Adios");
			System.exit(0);
			break;
		case 5:
			fraccion.invierte();
		default:
			System.out.println("Escoja una opcion valida (1-5)");
		}
		} while(true);
	}

}
