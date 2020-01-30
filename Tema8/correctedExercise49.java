package tema8;

import java.util.Scanner;

public class correctedExercise49 {

	public static void main(String[] args) {
		int[] array = new int[2000000];
		String[] arrayToChar = new String[array.length];
		String currentNumber = "1"; 
		int counter;
		System.out.println("Series printer");
		System.out.println("**************");
		System.out.println("Input your iterations");
		Scanner numberParser = new Scanner(System.in);
		int numberOfIterations = numberParser.nextInt();
		int numberCounter = 0;
		int iterationCounter = 0;
		int numberOfDigits = 0;
		String currentPrint = "";
		System.out.println(currentNumber);
		while (iterationCounter < numberOfIterations-1) {
			try {
				numberOfDigits = Exercise01.findTheDigits(Integer.parseInt(currentNumber)); 
			} catch (NumberFormatException ex) {
				numberOfDigits = Exercise01.findTheDigits(currentNumber);
			}
			int arrayCounter = 0;
			int numberToPrint = 1;
			boolean looped = false;
			while (arrayCounter < numberOfDigits) {
				while (array[arrayCounter] == array[arrayCounter + 1] && array[arrayCounter] != 0) {
					if (array[arrayCounter + 1] == 1) {
						numberToPrint = 1;
					}
					if (array[arrayCounter + 1] == 2) {
						numberToPrint = 2;
					}
					if (array[arrayCounter + 1] == 3) {
						numberToPrint = 3;
					}
					numberCounter++;
					arrayCounter++;
					looped = true;
				}
				if (!looped) {
					if (array[arrayCounter] == 1) {
						numberToPrint = 1;
					}
					if (array[arrayCounter] == 2) {
						numberToPrint = 2;
					}
					if (array[arrayCounter] == 3) {
						numberToPrint = 3;
					}	
				}
				numberCounter++;
				System.out.print("" + numberCounter + "" + numberToPrint);
				currentPrint += "" + numberCounter + "" + numberToPrint;
				numberCounter = 0;
				arrayCounter++;
				looped = false;
			}
			currentNumber = currentPrint;
			iterationCounter++;
			currentPrint = "";
			arrayCounter = 0;
			numberCounter = 0;
			System.out.println();
			try {
				numberOfDigits = Exercise01.findTheDigits(Integer.parseInt(currentNumber)); 
			} catch (NumberFormatException ex) {
				numberOfDigits = Exercise01.findTheDigits(currentNumber);
			}
			array = Exercise01.putNumberIntoArray(array, currentNumber, numberOfDigits);
		}
	}
}
