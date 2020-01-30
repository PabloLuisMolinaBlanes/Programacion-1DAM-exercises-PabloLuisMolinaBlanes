package Tema9;
import java.util.Scanner;
import java.util.ArrayList;
public class initDisco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner textParser = new Scanner(System.in);
		ArrayList<Disco> discos = new ArrayList<Disco>();
		int option = 0;
		do {
		System.out.println("1. Crear disco");
		System.out.println("2. Modificar disco");
		System.out.println("3. Eliminar disco");
		System.out.println("4. Listar discos");
		System.out.println("5. Salir");
		option = sc.nextInt();
		switch (option) {
		case 1:
			sc.nextLine();
			System.out.println("Inserte codigo");
			String codigo = textParser.nextLine();
			System.out.println("Inserte album");
			String album = textParser.nextLine();
			System.out.println("Inserte autor");
			String autor = textParser.nextLine();
			System.out.println("Inserte genero");
			String genero = textParser.nextLine();
			System.out.println("Inserte titulo");
			String titulo = textParser.nextLine();
			discos.add(new Disco(codigo,genero,titulo,album,autor));
		    break;
		case 2:
			sc.nextLine();
			System.out.println("Inserte el codigo");
			String code = textParser.next();
			for (Disco d : discos) {
				if (d.getCodigo().equals(code)) {
					textParser.nextLine();
					System.out.println("Inserte codigo");
					System.out.println("Codigo: " + d.getCodigo());
					 codigo = textParser.nextLine();
					if (codigo.equals("")) {
						
					} else {
						d.setCodigo(codigo);
					}
					System.out.println("Inserte album");
					System.out.println("Album: " + d.getAlbum());
					album = textParser.nextLine();
					if (album.equals("")) {
						
					} else {
						d.setAlbum(album);
					}
					System.out.println("Inserte autor");
					System.out.println("Autor: " + d.getAutor());
					autor = textParser.nextLine();
					if (autor.equals("")) {
						
					} else {
						d.setAutor(autor);
					}
					System.out.println("Inserte genero");
					System.out.println("Genero: " + d.getGenero());
					genero = textParser.nextLine();
					if (genero.equals("")) {
						
					} else {
						d.setGenero(genero);
					}
					System.out.println("Inserte titulo");
					System.out.println("Titulo: " + d.getTitulo());
					titulo = textParser.nextLine();
					if (titulo.equals("")) {
						
					} else {
						d.setTitulo(titulo);
					}
					break;
				}
			}
			System.out.println("Disco no encontrado");
			break;
		case 3:
			sc.nextLine();
			System.out.println("Inserte el codigo");
			code = textParser.nextLine();
			int index = 0;
			for (Disco d : discos) {
				if (d.getCodigo().equals(code)) {
					textParser.nextLine();
					discos.remove(index);
					break;
					}
				index++;
				}
			System.out.println("Disco no encontrado");
			break;
		case 4:
			sc.nextLine();
			int counter = 0;
			for (Disco d : discos) {
				System.out.println(discos.get(counter));
				counter++;
			}
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Opcion no reconocida");
			
		}
		System.out.println("Presione Intro");
		textParser.nextLine();
		} while (option != 5);
	}

}
