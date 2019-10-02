import java.util.stream.*;
import java.util.*;
public class Exercise07And08 {
	public static void main(String[] args) {
		System.out.println("This program is thought to calculate the average for three marks");
		int numberOfExams = 3;
		double[] marksInputted = new double[numberOfExams + 1];
		int i = 1;
		System.out.println("Please, input your first mark");
		marksInputted[1] = Double.parseDouble(System.console().readLine());
		i++;
		while (i <= numberOfExams) {
			System.out.println("Now, input your " + i + "th mark");
			marksInputted[i] = Double.parseDouble(System.console().readLine());
			i++;
		} 
		double result = (Arrays.stream(marksInputted).sum())/numberOfExams;
		if (result <= 10) {
		System.out.printf("The average for the marks is %.3f\n", result);
	} else {
		System.out.println("Error, no such mark exists");
	}
	if (result < 5) {
		System.out.println("That means 'insuficiente'");
		System.exit(0);
	} else if ((result - 5) < 1) {
		System.out.println("That means 'suficiente'");
		System.exit(0);
	} else if ( (result - 6) < 1) {
		System.out.println("That means 'bien'");
		System.exit(0);
	} else if ( (result - 7) < 2) {
		System.out.println("That means 'notable'");
		System.exit(0);
	} else if ( (result - 9) <= 1) {
		System.out.println("That means 'sobresaliente'");
		System.exit(0);	
	} else {
		System.out.println("Invalid result obtained, Is it more than 10?");
		System.exit(0);	
		}
	}
}
