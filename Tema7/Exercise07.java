package tema7;
import java.util.Scanner;
public class Exercise07 {
	public static void main(String[] args) {
		Scanner numberParser = new Scanner(System.in);
		int numberOfNumbersStored = 100;
		int[] arrayOfRandomity = new int[numberOfNumbersStored];
		int randomNumber = (int) ((Math.random()*20)+1);
		int numberCounter = 0;
		while (numberCounter < numberOfNumbersStored) {
			arrayOfRandomity[numberCounter] = randomNumber;
			randomNumber = (int) ((Math.random()*20)+1);
			numberCounter++;
		}
		System.out.println("Number changer");
		System.out.println("**************");
		System.out.println("An 100 elements array has been made in your system. Input two numbers, the one you want to substitute in the array and the one you want it substituted as");
		int firstNumber = numberParser.nextInt();
		int secondNumber = numberParser.nextInt();
		numberCounter = 0;
		System.out.print("Changed array: "); 
		while (numberCounter < numberOfNumbersStored) {
			if (arrayOfRandomity[numberCounter] == firstNumber) {
				arrayOfRandomity[numberCounter] = secondNumber;
				System.out.print("\"" + arrayOfRandomity[numberCounter] + "\" ");
			} else {
				System.out.print(arrayOfRandomity[numberCounter] + " ");
			}
			
			numberCounter++;
		}
	}
}
