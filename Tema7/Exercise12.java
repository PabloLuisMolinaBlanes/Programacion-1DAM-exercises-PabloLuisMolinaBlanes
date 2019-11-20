package tema7;
import java.util.Scanner;
public class Exercise12 {
	public static void main(String[] args) {
		int[] baseArray = new int[10];
		Scanner numberParser = new Scanner(System.in);
		System.out.print("Input 10 numbers");
		int auxWhichPutsNumbers = 0;
		for (int arrayCounter : baseArray) {
			baseArray[auxWhichPutsNumbers] = numberParser.nextInt();
			auxWhichPutsNumbers++;
		}
		int numberCount = 0;
		for (int arrayCounter : baseArray) {
			System.out.print(numberCount + " ");
			numberCount++;
		}
		System.out.println();
		int currentKey = 0;
		for (int arrayCounter : baseArray) {
			System.out.print(baseArray[currentKey] + " ");
			currentKey++;
		}
		int initialPosition;
		int finalPosition;
		do { 
			System.out.println("Input initial position");
			initialPosition = numberParser.nextInt();
			System.out.println("Input final position");
			finalPosition = numberParser.nextInt();
			if (initialPosition > finalPosition) {
				System.out.println("The initial position cannot be higher than the final position");
			}
			if (initialPosition > 9 || initialPosition < 0 ) {
				System.out.println("Invalid value for the initial position. It has to be more than 0 or less than 9");
			}
			if (finalPosition > 9 || finalPosition < 0 ) {
				System.out.println("Invalid value for the final position. It has to be more than 0 or less than 9");
			}
		} while (initialPosition > finalPosition || ((initialPosition > 9 || initialPosition < 0) || (finalPosition < 0 || finalPosition > 9)));
		int backupSecond = baseArray[baseArray.length - 1];
		int backupThird = baseArray[initialPosition];
		currentKey = baseArray.length-1;
		while (currentKey > 0) {
			if (currentKey <= initialPosition || currentKey > finalPosition) {
				baseArray[currentKey] = baseArray[currentKey-1];
			}
			currentKey--;
		}
		currentKey = 0;
		baseArray[0] = backupSecond;
		baseArray[finalPosition] = backupThird;
		while (currentKey < baseArray.length) {
			System.out.print(baseArray[currentKey] + " ");
			currentKey++;
		}
	}
}
