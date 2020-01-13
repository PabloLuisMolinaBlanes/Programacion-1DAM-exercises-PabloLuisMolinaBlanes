package tema7;

public class Exercise18 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] resultArray = new int[10];
		int randomNumber = (int) (Math.random()*201);
		int arrayCounter = 0;
		for (int counter : array) {
			array[arrayCounter] = randomNumber;
			randomNumber = (int) (Math.random()*201);
			arrayCounter++;
		}
		arrayCounter = 0;
		System.out.println("Original Array");
		for (int counter : array) {
			System.out.println(arrayCounter + " " + array[arrayCounter]);
			arrayCounter++;
		}
		arrayCounter = 0;
		int counterForMinors = 0;
		int counterForMajors = 0;
		while (arrayCounter < resultArray.length) {
			while (array[counterForMajors] > 100 && counterForMajors < resultArray.length-1) {
				counterForMajors++;
			}
			if (array[counterForMajors] <= 100) {
			resultArray[arrayCounter] = array[counterForMajors];
			arrayCounter++;
			if (counterForMajors != 9) {
				counterForMajors++;	
			}
			}
			while (array[counterForMinors] <= 100 && counterForMinors < resultArray.length-1) {
				counterForMinors++;
			}
			if (array[counterForMinors] > 100) {
				resultArray[arrayCounter] = array[counterForMinors];
				arrayCounter++;
				if (counterForMinors != 9) {
					counterForMinors++;	
				}
			}
		}
		System.out.println("Modified array");
		arrayCounter = 0;
		for (int counter : array) {
			System.out.println(arrayCounter + " " + resultArray[arrayCounter]);
			arrayCounter++;
		}
	}
}
