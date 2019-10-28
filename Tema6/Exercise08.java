
public class Exercise08 {
	public static void main(String[] args) {
		int numeroDeColumnas = 3;
		int numeroDeApuesta = (int) (Math.random()*20+1);
		int numeroDeApuesta2 = (int) (Math.random()*20+1);
		int contadorDeColumnas = 0;
		int contadorDeFilas = 0;
		int numeroDeFilas = 14;
		int randomizer = (int) Math.random()*6+1;
		boolean isItOne = randomizer == 2 || randomizer == 4 || randomizer == 6;
		boolean isItTwo = randomizer == 1;
		boolean isItMyNumber = randomizer == 3 || randomizer == 5; 
		while (contadorDeFilas <= numeroDeFilas) {
			System.out.print("Partido " + contadorDeFilas + " ");
			while (contadorDeColumnas < numeroDeColumnas) {
				if (isItOne) {
					numeroDeApuesta = 1;
				} else if (isItTwo) {
					numeroDeApuesta = 2;
				}
				System.out.print(numeroDeApuesta + " X " + numeroDeApuesta2 + " ");
				contadorDeColumnas++;
				numeroDeApuesta = (int) (Math.random()*20+1);
				numeroDeApuesta2 = (int) (Math.random()*20+1);
			    randomizer = (int) (Math.random()*6+1);
				isItOne = randomizer == 2 || randomizer == 4 || randomizer == 6;
			    isItTwo = randomizer == 1;
				isItMyNumber = randomizer == 3 || randomizer == 5;
			}
			contadorDeFilas++;
			System.out.println("");
			contadorDeColumnas = 0;
		}
		numeroDeApuesta = (int) (Math.random()*20+1);
		numeroDeApuesta2 = (int) (Math.random()*20+1);
		if (isItOne) {
			numeroDeApuesta = 1;
		} else if (isItTwo) {
			numeroDeApuesta = 2;
		}
		System.out.print("Pleno al 15 " + numeroDeApuesta + " X " + numeroDeApuesta2);
	}
}
