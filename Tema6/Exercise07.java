
public class Exercise07 {
	public static void main(String[] args) {
		int numeroDeColumnas = 3;
		int numeroDeApuesta = (int) (Math.random()*20+1);
		int numeroDeApuesta2 = (int) (Math.random()*20+1);
		int contadorDeColumnas = 0;
		int contadorDeFilas = 0;
		int numeroDeFilas = 14;
		while (contadorDeFilas <= numeroDeFilas) {
			System.out.print("Partido " + contadorDeFilas + " ");
			while (contadorDeColumnas < numeroDeColumnas) {
				System.out.print(numeroDeApuesta + " X " + numeroDeApuesta2 + " ");
				contadorDeColumnas++;
				numeroDeApuesta = (int) (Math.random()*20+1);
				numeroDeApuesta2 = (int) (Math.random()*20+1);
			}
			contadorDeFilas++;
			System.out.println("");
			contadorDeColumnas = 0;
		}
		numeroDeApuesta = (int) (Math.random()*20+1);
		numeroDeApuesta2 = (int) (Math.random()*20+1);
		System.out.print("Pleno al 15 " + numeroDeApuesta + " X " + numeroDeApuesta2);
	}
}
