package tema10;

import java.util.Scanner;
import java.util.ArrayList;
public class gestisimalInit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner textParser = new Scanner(System.in);
		ArrayList<Gestisimal> gestisimales = new ArrayList<Gestisimal>();
		int option = 0;
		do {
		System.out.println("1. Crear Gestisimal");
		System.out.println("2. Modificar Gestisimal");
		System.out.println("3. Eliminar Gestisimal");
		System.out.println("4. Listar gestisimales");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
		option = sc.nextInt();
		switch (option) {
		case 1:
			sc.nextLine();
			System.out.println("Inserte codigo");
			String codigo = textParser.nextLine();
			System.out.println("Inserte Descripcion");
			String Descripcion = textParser.nextLine();
			System.out.println("Inserte Venta");
			double Venta = Double.parseDouble(textParser.nextLine());
			System.out.println("Inserte Compra");
			double Compra = Double.parseDouble(textParser.nextLine());
			System.out.println("Inserte Stock");
			int Stock = Integer.parseInt(textParser.nextLine());
			gestisimales.add(new Gestisimal(codigo,Descripcion,Compra,Venta,Stock));
		    break;
		case 2:
			sc.nextLine();
			System.out.println("Inserte el codigo");
			String code = textParser.next();
			int index = 0;
			for (Gestisimal d : gestisimales) {
				if (d.getCodigo().equals(code)) {
					textParser.nextLine();
					System.out.println("Inserte codigo");
					System.out.println("Codigo: " + d.getCodigo());
					 codigo = textParser.nextLine();
					if (codigo.equals("")) {
						
					} else {
						d.setCodigo(codigo);
					}
					System.out.println("Inserte Descripcion");
					System.out.println("Descripcion: " + d.getDescripcion());
					Descripcion = textParser.nextLine();
					if (Descripcion.equals("")) {
						
					} else {
						d.setDescripcion(Descripcion);
					}
					System.out.println("Inserte Venta");
					System.out.println("Venta: " + d.getVenta());
					codigo = textParser.nextLine();
					if (codigo.equals("")) {
						
					} else {
						d.setVenta(Double.parseDouble(codigo));
					}
					System.out.println("Inserte Compra");
					System.out.println("Compra: " + d.getCompra());
					codigo = textParser.nextLine();
					if (codigo.equals("")) {
						
					} else {
						d.setCompra(Double.parseDouble(codigo));
					}
					System.out.println("Inserte Stock");
					System.out.println("Stock: " + d.getStock());
					codigo = textParser.nextLine();
					if (codigo.equals("")) {
						
					} else {
						d.setStock(Integer.parseInt(codigo));
					}
					break;
				}
				index++;
			}
			if (index >= gestisimales.size()) {
				System.out.println("Gestisimal no encontrado");
				textParser.nextLine();
			}
			break;
		case 3:
			sc.nextLine();
		    int size = gestisimales.size();
			System.out.println("Inserte el codigo");
			code = textParser.nextLine();
		    index = 0;
			for (Gestisimal d : gestisimales) {
				if (d.getCodigo().equals(code)) {
					gestisimales.remove(index);
					break;
					} 
				index++;
				}
			if (index >= size) {
				System.out.println("Gestisimal no encontrado");
			}
			break;
		case 4:
			sc.nextLine();
			int counter = 0;
			for (Gestisimal d : gestisimales) {
				System.out.println(gestisimales.get(counter));
				counter++;
			}
			break;
		case 5:
			sc.nextLine();
		    size = gestisimales.size();
			System.out.println("Inserte el codigo");
			code = textParser.next();
			index = 0;
			for (Gestisimal d : gestisimales) {
				if (d.getCodigo().equals(code)) {
					textParser.nextLine();
					System.out.println("Cuanto stock mas hay?");
					int sum = Integer.parseInt(textParser.nextLine());
					d.sumStock(sum);
					break;
				}
			}
			if (index >= size) {
				System.out.println("Gestisimal no encontrado");
			}
			break;
		case 6:
			sc.nextLine();
		    size = gestisimales.size();
			System.out.println("Inserte el codigo");
			 code = textParser.next();
			 index = 0;
			for (Gestisimal d : gestisimales) {
				if (d.getCodigo().equals(code)) {
					textParser.nextLine();
					System.out.println("Cuanto stock menos hay?");
					int sub = Integer.parseInt(textParser.nextLine());
					d.subStock(sub);
					break;
				}
			}
			if (index >= size) {
				System.out.println("Gestisimal no encontrado");
			}
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("Opcion no reconocida");
		}
		System.out.println();
		System.out.println("Presione Intro");
		textParser.nextLine();
		} while (option != 7);
	}

}
