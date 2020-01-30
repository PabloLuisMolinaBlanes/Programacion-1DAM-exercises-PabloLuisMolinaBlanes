package Tema9;

public class fichasAleatoriasEncajantes {

	public static void main(String[] args) {
		FichaDomino ficha1 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha2 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha3 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha4 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha5 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha6 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha7 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		FichaDomino ficha8 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		while (!ficha1.encaja(ficha2) || ficha1.derecha != ficha2.izquierda) {
			ficha1 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		    ficha2 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		}
		while (!ficha2.encaja(ficha3) || ficha2.derecha != ficha3.izquierda) {
			ficha3 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		}
		while (!ficha3.encaja(ficha4) || ficha3.derecha != ficha4.izquierda) {
			ficha4 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		}
		while (!ficha4.encaja(ficha5) || ficha4.derecha != ficha5.izquierda) {
			ficha5 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
			
		}
		while (!ficha5.encaja(ficha6) || ficha5.derecha != ficha6.izquierda) {
			ficha6 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
				
		}
		while (!ficha6.encaja(ficha7) || ficha6.derecha != ficha7.izquierda) {
			ficha7 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
			
		}
		while (!ficha7.encaja(ficha8) || ficha7.izquierda != ficha8.derecha) {
			ficha8 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));
		}
		System.out.print("" + ficha1+ficha2+ficha3+ficha4+ficha5+ficha6+ficha7+ficha8);

		
	}

}
