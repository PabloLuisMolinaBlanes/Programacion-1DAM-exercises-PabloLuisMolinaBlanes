package tema7;
import java.util.Scanner;
public class Exercise13 {
	public static void main(String[] args) {
		int[] aHundredNumberArray = new int[100];
		int randomNum = (int) (Math.random()*501);
		int arrayCounter = 0;
		for (int counter : aHundredNumberArray) {
			aHundredNumberArray[arrayCounter] = randomNum;
			randomNum = (int) (Math.random()*501);
			arrayCounter++;
		}
		arrayCounter = 0;
		for (int counter : aHundredNumberArray) {
			System.out.print(aHundredNumberArray[arrayCounter] + " ");
			arrayCounter++;
		}
		System.out.println();
		System.out.println("Do you want to highlight the maximum or the minimum? (max - 1; min - 2)");
		Scanner numberParser = new Scanner(System.in);
		int result = numberParser.nextInt();
		int numberGiven = 4;
		int currentPosition = 0;
		arrayCounter = 0;
		if (result == 1) {
			numberGiven = 0;
			for (int counter : aHundredNumberArray) {
				if (aHundredNumberArray[arrayCounter] > numberGiven) {
					numberGiven = aHundredNumberArray[arrayCounter];
					currentPosition = arrayCounter;
				}
				arrayCounter++;
			}
		} else {
			numberGiven = Integer.MAX_VALUE-10;
			for (int counter : aHundredNumberArray) {
				if (aHundredNumberArray[arrayCounter] < numberGiven) {
					numberGiven = aHundredNumberArray[arrayCounter];
					currentPosition = arrayCounter;
				}
				arrayCounter++;
			}
		}
		arrayCounter = 0;
		for (int counter : aHundredNumberArray) {
			if (arrayCounter == currentPosition ) {
				System.out.print(" **" + aHundredNumberArray[arrayCounter] + "** " );
			} else {
				System.out.print(aHundredNumberArray[arrayCounter] + " ");
			}
			arrayCounter++;
		}
	}
}
