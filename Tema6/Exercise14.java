import java.util.Scanner;
public class Exercise14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner isTheNumber = new Scanner(System.in);
		Scanner biggerOrSmaller = new Scanner(System.in);
		String isIt = "";
		int maximumNumber = 100;
		int minimumNumber = 0;
		int numberOfOpportunities = 5;
		System.out.print("Let's play, I have to guess your number, input it. ");
		int randomNumberForMeToGuess = sc.nextInt();
		int myGuess = (int) ((Math.random() * maximumNumber) + minimumNumber);
		while (!isIt.equals("y") && numberOfOpportunities > 0) {
			System.out.print("I have " + numberOfOpportunities + " opportunities ");
			System.out.print("Is your number " + myGuess + "? y/n ");
			isIt = isTheNumber.nextLine();
			if (isIt.equals("y")) {
				System.out.print("I win!");
			}
			if (isIt.equals("n")) {
				numberOfOpportunities--;
				System.out.print("Is your number bigger or smaller? b/s ");
				isIt = biggerOrSmaller.nextLine();
				if (isIt.equals("b")) {
					minimumNumber = myGuess;
				}
				if (isIt.equals("s")) {
					maximumNumber = myGuess-minimumNumber;
				}
				myGuess = (int) ((Math.random() * maximumNumber) + minimumNumber);
			}
		}
	}
}
