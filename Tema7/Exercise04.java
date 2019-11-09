package tema7;

public class Exercise04 {
	public static void main(String[] args) {
	System.out.println("Number | Square | Cube");
	int[] numbers = new int[20];
	int[] squared = new int[20];
	int[] cube = new int[20];
	int counterOfNumbers = 0;
	int randomNumber = (int) ((Math.random()*101));
	while (counterOfNumbers < numbers.length) {
		numbers[counterOfNumbers] = randomNumber;
		counterOfNumbers++;
		randomNumber = (int) ((Math.random()*101));
	}
	counterOfNumbers = 0;
	while (counterOfNumbers < numbers.length) {
		squared[counterOfNumbers] = (int) Math.pow(numbers[counterOfNumbers], 2);
		counterOfNumbers++;
	}
	counterOfNumbers = 0;
	while (counterOfNumbers < numbers.length) {
		cube[counterOfNumbers] = (int) Math.pow(numbers[counterOfNumbers], 3);
		counterOfNumbers++;
	}
	counterOfNumbers = 0;
	while (counterOfNumbers < numbers.length) {
		System.out.print(" " + numbers[counterOfNumbers] + "       " + squared[counterOfNumbers] +  "      " + cube[counterOfNumbers] +  "\n");
		counterOfNumbers++;
	}
}
}

