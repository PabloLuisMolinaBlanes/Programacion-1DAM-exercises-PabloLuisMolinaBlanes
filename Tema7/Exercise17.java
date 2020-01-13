package tema7;
import java.util.Scanner;
public class Exercise17 { // If the number input by the user is repeated inside of the array, it only considers the first found to go onto the first position of the array. 
	public static void main(String[] args) {
		int[] randomGeneratedNumbers = new int[100];
		int randomNum = (int) (Math.random()*101);
		int arrayCounter = 0;
		for (int counter : randomGeneratedNumbers) {
			randomGeneratedNumbers[arrayCounter] = randomNum;
			randomNum = (int) (Math.random()*101);
			arrayCounter++;
		}
		arrayCounter = 0;
		System.out.println("Please, input a number until you find one");
		Scanner numberParser = new Scanner(System.in);
		int numberTyped;
		int currentPosition = 0;
		boolean notFound = true;
		do {
			numberTyped = numberParser.nextInt();
			for (int counter : randomGeneratedNumbers) {
				if (randomGeneratedNumbers[arrayCounter] == numberTyped) {
					notFound = false;
					System.out.println("Number found");
					currentPosition = arrayCounter;
				}
				arrayCounter++;
			}
			arrayCounter = 0;
		} while(notFound);
		int lastDigit = randomGeneratedNumbers[randomGeneratedNumbers.length-1];
		arrayCounter = randomGeneratedNumbers.length-1;
		while (currentPosition < 100) {
			while (arrayCounter > 0) {
				randomGeneratedNumbers[arrayCounter] = randomGeneratedNumbers[arrayCounter-1];
				arrayCounter--;
			}	
			randomGeneratedNumbers[0] = lastDigit;
			currentPosition++;
			arrayCounter = randomGeneratedNumbers.length-1;
			lastDigit = randomGeneratedNumbers[randomGeneratedNumbers.length-1];
		}
		System.out.println("Shifted Array: ");
		arrayCounter = 0;
		while (arrayCounter < randomGeneratedNumbers.length) {
			System.out.print(randomGeneratedNumbers[arrayCounter] + " ");
			arrayCounter++;
		}
	}
}
