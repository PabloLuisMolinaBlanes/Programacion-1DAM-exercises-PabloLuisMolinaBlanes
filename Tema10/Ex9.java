package tema10;
import java.util.ArrayList;
import java.util.Collections;
public class Ex9 {
	public static void main(String[] args) {
		boolean checkAgain = false;
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		int counter = 0;
		while (counter < 10) {
			cartas.add(new Carta());
			counter++;
		}
		counter = 0;
		while (counter < 10) {
			int aux = counter + 1;
			int auxSecond = counter - 1;
			while (aux < 10 || checkAgain) {
				if (checkAgain && aux == (counter + 1)) {
					System.out.println("Ookay");
				}
				while ((cartas.get(counter).compareToCard(cartas.get(aux)) == 0)) {
					cartas.set(counter, new Carta());
					if (checkAgain) {
						System.out.println("Actually, you did!"); 
					}
				}
				if (checkAgain && aux == 9) {
					System.out.println("I think it is all set");
					checkAgain = false;
				}
				aux++;
			}
			while (auxSecond > 0) {
				while ((cartas.get(counter).compareToCard(cartas.get(auxSecond)) == 0)) {
					checkAgain = true;
					System.out.println("Check again, I could have changed something");
					cartas.set(counter, new Carta());
				}
				auxSecond--;
			}
			if (!checkAgain) {
				counter++;	
			}
		}
		counter = 0;
		Collections.sort(cartas);
		while (counter < 10) {
			System.out.println(cartas.get(counter));
			counter++;
		}
		
	}

}

