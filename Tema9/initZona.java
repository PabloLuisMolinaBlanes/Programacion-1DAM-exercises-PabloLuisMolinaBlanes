package Tema9;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class initZona {
	public static void main(String[] args) {
		List<Zona> listZona = new ArrayList<Zona>();
		Scanner textParser = new Scanner(System.in);
		Zona salaPrincipal = new Zona(1000);
		listZona.add(salaPrincipal);
		Zona compraVenta = new Zona(200);
		listZona.add(compraVenta);
		Zona vip = new Zona(25);
		listZona.add(vip);
		int recol = 1;
		do {
		System.out.println("1. Mostrar numero de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		int option = textParser.nextInt();
		switch (option) {
		case 1:
			System.out.println("Que zona le interesa?");
			for (Zona zona : listZona) {
				System.out.println(recol + ". " + listZona.get(recol-1));
				recol++;
			}
			recol = 1;
			int choosezone = textParser.nextInt();
			Zona currentZonasecond = listZona.get(choosezone-1);
			System.out.println(currentZonasecond.getEntradasPorVender());
			break;
		case 2:
			System.out.println("Que zona le interesa?");
			for (Zona zona : listZona) {
				System.out.println(recol + ". " + listZona.get(recol-1));
				recol++;
			}
			recol = 1;
			int choose = textParser.nextInt();
			Zona currentZona = listZona.get(choose-1);
			System.out.println("Cuantas entradas?");
			int number = textParser.nextInt();
			currentZona.vender(number);
			break;
		case 3:
			System.exit(0);
			break;
		 default:
			System.out.println("Opcion invalida");
		}
		} while(true);
	}

}
