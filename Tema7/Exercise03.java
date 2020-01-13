package tema7;
import java.util.Scanner;
public class Exercise03 {
	public static void main(String[] args) {
		int[] array = new int[12];
		int counter = 0;
		Scanner numberParser = new Scanner(System.in);
		System.out.println("Input 12 numbers");
		while (counter < array.length) {
			array[counter] = numberParser.nextInt();
			counter++;
		}
		counter = array.length - 1;
		while (counter >= 0) {
			System.out.print(array[counter] + " ");
			counter--;
		}
	}
}
