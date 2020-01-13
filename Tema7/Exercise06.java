package tema7;
import java.util.Scanner;
public class Exercise06 {
	public static void main(String[] args) {
		Scanner numberParser = new Scanner(System.in);
		int arrayCount = 15;
		int[] array = new int[arrayCount];
		System.out.println("Array orderer");
		System.out.println("*************");
		System.out.println("Type in 15 numbers");
		int currentAdding = 0;
		int counterForNumbers = 0;
		while (counterForNumbers < arrayCount) {
			currentAdding = numberParser.nextInt();
			array[counterForNumbers] = currentAdding;
			counterForNumbers++;
		}
		counterForNumbers = 0;
		int lastDigit = array[array.length-1];
		System.out.print("Array: ");
		while (counterForNumbers < arrayCount) {
			System.out.print(array[counterForNumbers] + " ");
			counterForNumbers++;
		}
		counterForNumbers = arrayCount-1;
		while (counterForNumbers > 0) {
			array[counterForNumbers] = array[counterForNumbers-1];
			counterForNumbers--;
		}	
		array[0] = lastDigit;
		counterForNumbers = 0;
		System.out.println("");
		System.out.print("Shifted Array: ");
		while (counterForNumbers < arrayCount) {
			System.out.print(array[counterForNumbers] + " ");
			counterForNumbers++;
		}
	}
}
