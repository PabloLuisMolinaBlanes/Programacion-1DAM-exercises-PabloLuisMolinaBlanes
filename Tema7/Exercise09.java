package tema7;
import java.util.Scanner;
public class Exercise09 {
	public static void main(String[] args) {
	System.out.println("Even/Uneven finder");
	System.out.println("***********");
	System.out.println("Input 8 numbers, a list will be created which distinguishes even numbers from non even numbers");
	int[] evenAndNon = new int[8];
	Scanner numberParser = new Scanner(System.in);
	for (int numberCounter = 0; numberCounter < evenAndNon.length; numberCounter++) {
		evenAndNon[numberCounter] = numberParser.nextInt();
	}
	for (int numberCounter = 0; numberCounter < evenAndNon.length; numberCounter++) {
		if (evenAndNon[numberCounter] % 2 == 0) {
			System.out.println("Even: " + evenAndNon[numberCounter]);
		} else {
			System.out.println("Uneven: " + evenAndNon[numberCounter]);
		}
	}
}
}
