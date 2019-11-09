package tema7;
import java.util.Scanner;
public class Exercise05 {
	public static void main(String[] args) {
		int numberOfLoops = 10;
		int[] numberCount = new int[numberOfLoops]; 
		Scanner numberParser = new Scanner(System.in);
		System.out.println("Maximum and minimum finder");
		System.out.println("**************************");
		System.out.println("Type 10 numbers");
		int counterOfNumbers = 0;
		while (counterOfNumbers < numberOfLoops) {
			numberCount[counterOfNumbers] = numberParser.nextInt();
			counterOfNumbers++;
		}
		int currentMinimum = Integer.MAX_VALUE;
		int currentMaximum = 0;
		counterOfNumbers = 0;
		int currentNumber = 0;
		while (counterOfNumbers < numberOfLoops) {
			currentNumber = numberCount[counterOfNumbers];
			if (currentNumber > currentMaximum) {
				currentMaximum = currentNumber;
			}
			if (currentNumber < currentMinimum) {
				currentMinimum = currentNumber;
			}
			counterOfNumbers++;
		}
		System.out.println("Maximum: " + currentMaximum);
		System.out.println("Minimum: " + currentMinimum);
	}
}
