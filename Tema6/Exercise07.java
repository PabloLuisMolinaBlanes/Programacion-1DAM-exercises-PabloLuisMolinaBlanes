
public class Exercise07 {
	public static void main(String[] args) {
		int numeroDeColumnas = 3;
		int numeroDeApuestaToInt = (Math.random()*3);
		String numeroDeApuesta = String.valueOf(numeroDeApuestaToInt);
		if (numeroDeApuestaToInt == "3") {
			numeroDeApuesta = "X"
		}
		int contadorDeColumnas = 0;
		int contadorDeFilas = 0;
		int numeroDeFilas = 14;
		while (contadorDeFilas <= numeroDeFilas) {
			System.out.print("Partido " + contadorDeFilas + " ");
			while (contadorDeColumnas < numeroDeColumnas) {
				System.out.print(numeroDeApuesta + " ");
				contadorDeColumnas++;
				numeroDeApuestaToInt = (int) (Math.random()*3);
				String numeroDeApuesta = String.valueOf(numeroDeApuestaToInt);
				if (numeroDeApuestaToInt == "3") {
					numeroDeApuesta = "X"
				}
			}
			contadorDeFilas++;
			System.out.println("");
			contadorDeColumnas = 0;
		}
		numeroDeApuesta = (int) (Math.random()*3);
		String numeroDeApuesta = String.valueOf(numeroDeApuestaToInt);
		if (numeroDeApuestaToInt == "3") {
			numeroDeApuesta = "X"
		}
		System.out.print("Pleno al 15 " + numeroDeApuestaToString);
	}
}
