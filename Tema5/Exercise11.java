
public class Exercise11 {	
	public static void main (String[] args) {
		System.out.println("This program is thought to calculate the cube and the square of the five numbers after the first inputted");
    System.out.print("Please, input the number: ");
    int numberInputted = Integer.parseInt(System.console().readLine());
    int counter;
    for (counter = 0; counter <= 5; counter++) {
    System.out.printf("For %d, it is %.0f for the square and %.0f for the cube\n", numberInputted+counter, Math.pow(numberInputted+counter, 2), Math.pow(numberInputted+counter, 3));
    } 
	}
}

