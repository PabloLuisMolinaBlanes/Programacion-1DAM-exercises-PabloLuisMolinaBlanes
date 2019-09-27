import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner grades = new Scanner(System.in);
		System.out.println("Which is your mark in the first exam?");
		double firstExamGrade = grades.nextDouble();
		System.out.println("Which mark do you want at the end of the term?");
		double wishedForGrade = grades.nextDouble();
		double secondExamGradeToGet = (wishedForGrade - (0.4 * firstExamGrade)) / 0.6; 
		if (secondExamGradeToGet > 10) {
      System.out.println("The mark you are looking for is not possible with the mark from your first exam");
		}
		else {
			System.out.printf("Your mark in the following exam should be of %.2f points\n", secondExamGradeToGet);
			}
}
}
