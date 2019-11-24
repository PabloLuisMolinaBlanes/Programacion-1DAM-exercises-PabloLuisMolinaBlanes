package tema7;
import java.util.Scanner;
public class Exercise19 {
	public static void main(String[] args) {
		int[] array = new int[12];
		int randomNum = (int) (Math.random()*201);
		int arrayCounter = 0;
		int digitCounter = 0;
		int digitCount = 0;
		int backup = 0;
		System.out.print("Ind");
		for (int counter: array) {
			array[arrayCounter] = randomNum;
			randomNum = (int) (Math.random()*201);
			arrayCounter++;
		}
		arrayCounter = 0;
		for (int counter: array) {
			backup = array[arrayCounter];
			while (array[arrayCounter] >= 1) {
				array[arrayCounter]/= 10;
				digitCounter++;
			}
			array[arrayCounter] = backup;
			while (digitCount < digitCounter) {
				System.out.print(" ");
				digitCount++;
			}
			System.out.print(arrayCounter);
			arrayCounter++;
			digitCounter = 0;
			digitCount = 0;
		}
		arrayCounter = 0;
		System.out.println();
		System.out.print("Tot");
		System.out.print(" ");
		boolean notDifferenced = true;
		for (int counter: array) {
			if (arrayCounter >= 10 && notDifferenced) {
				System.out.print(" ");
				notDifferenced = false;
			}
			System.out.print(array[arrayCounter] + " ");
			arrayCounter++;
		}
		System.out.println("Input the number you want to input inside the array");
		Scanner numberParser = new Scanner(System.in);
		int numberToInput = numberParser.nextInt();
		System.out.println("Input the position you want to insert it to");
		int position = numberParser.nextInt();
		arrayCounter = 0;
		arrayCounter = array.length-1;
		while (arrayCounter > position) {
			array[arrayCounter] = array[arrayCounter-1];
			arrayCounter--;
		}
		array[position] = numberToInput;
		arrayCounter = 0;
		System.out.println();
		System.out.print("Ind");
		arrayCounter = 0;
		for (int counter: array) {
			backup = array[arrayCounter];
			while (array[arrayCounter] >= 1) {
				array[arrayCounter]/= 10;
				digitCounter++;
			}
			array[arrayCounter] = backup;
			while (digitCount < digitCounter) {
				System.out.print(" ");
				digitCount++;
			}
			System.out.print(arrayCounter);
			arrayCounter++;
			digitCounter = 0;
			digitCount = 0;
		}
		arrayCounter = 0;
		System.out.println();
		System.out.print("Tot");
		System.out.print(" ");
		notDifferenced = true;
		for (int counter: array) {
			if (arrayCounter >= 10 && notDifferenced) {
				System.out.print(" ");
				notDifferenced = false;
			}
			System.out.print(array[arrayCounter] + " ");
			arrayCounter++;
		}
	}
}
