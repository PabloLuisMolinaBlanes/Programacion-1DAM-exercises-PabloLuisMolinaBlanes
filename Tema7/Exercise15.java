package tema7;
import java.util.Scanner;
public class Exercise15 {
	public static void main(String[] args) {
/*		
		┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐
		│Mesa nº  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │
		├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤
		│Ocupación│  3 │  2 │  0 │  2 │  4 │  1 │  0 │  2 │  1 │  1 │
		└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘
*/
		int[] mesas = new int[10];
		int randomNum = (int) (Math.random()*5);
		int arrayCounter = 0;
		while (arrayCounter < mesas.length) {
			mesas[arrayCounter] = randomNum;
			randomNum = (int) (Math.random()*5);
			arrayCounter++;
		}
		int numberOfClients;
		Scanner clientParser = new Scanner(System.in);
		do { 
			System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
			System.out.println("│Tabl nº  │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │");
			System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
			System.out.print("│Placing i│  ");
			arrayCounter = 0;
			while (arrayCounter < mesas.length) {
				System.out.print(mesas[arrayCounter] + " " + "|" + "  ");
				arrayCounter++;
			}
			System.out.println("|");
			System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
			System.out.println("How many are you?. (no more than 4 are allowed in a table). Input '-1' to exit");	
		numberOfClients = clientParser.nextInt();
		arrayCounter = 0;
		int currentMax = 4;
		while (arrayCounter < mesas.length && numberOfClients >= 1) {
				if ((numberOfClients + mesas[arrayCounter]) <= 4) {
					System.out.println("Please, sit at table " + (arrayCounter + 1));	
					mesas[arrayCounter] += numberOfClients;
					break;
				}
			arrayCounter++;
		}
		if (arrayCounter >= mesas.length) {
			System.out.println("Sorry, there are no places left");
		}
		} while (numberOfClients != -1);
		System.out.println("Thank you!");
	}
}
