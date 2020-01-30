package Tema9;

public class initPiramide {

	public static void main(String[] args) {
		Piramide p = new Piramide(4);
		Piramide p2 = new Piramide(6);
		Piramide p3 = new Piramide(8);
		Rectangulo r1 = new Rectangulo(4, 3);
		Rectangulo r2 = new Rectangulo(6, 2); 
		Rectangulo r3 = new Rectangulo(2, 2); 
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
		 System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
	}

}
