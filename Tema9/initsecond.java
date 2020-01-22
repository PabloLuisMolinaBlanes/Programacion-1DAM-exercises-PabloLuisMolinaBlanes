package Tema9;
import java.util.Scanner;
public class initsecond {
	public static void main(String[] args) {
		Scanner textParser = new Scanner(System.in);
		int option = 0;
		Bicicleta bici = new Bicicleta(30, 1, "Honda");
		Coche cochazo = new Coche(2000, 3, "Toyota");
		do {
		System.out.println("VEHÍCULOS");
		System.out.println("=========");
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
		System.out.println("Elige una opción (1-8):");
		option = textParser.nextInt();
		switch (option) {
		case 1:
			System.out.println("Cuanto?");
			int kilometroRecorrido = textParser.nextInt();
			bici.setKilometraje(kilometroRecorrido);
			System.out.println("Hecho");
			break;
		case 2:
			bici.hazCaballito();
			break;
		case 3:
			System.out.println("Cuanto?");
			int kilometroRecorridosegundo = textParser.nextInt();
			cochazo.setKilometraje(kilometroRecorridosegundo);
			System.out.println("Hecho");
			break;
		case 4:
			cochazo.quemaRueda();
			break;
		case 5:
			bici.getKilometraje();
			break;
		case 6:
			cochazo.getKilometraje();
			break;
		case 7:
			cochazo.getKilometrajeTotal();
			bici.getKilometrajeTotal();
			break;
		case 8:
			System.out.println("Adios");
			System.exit(0);
			break;
		default:
		System.out.println(cochazo);
		}
		} while (true);
	}

}
