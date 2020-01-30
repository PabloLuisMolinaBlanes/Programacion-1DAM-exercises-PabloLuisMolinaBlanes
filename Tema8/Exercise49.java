package tema8;
import java.util.Scanner;
public class Exercise49 {
	public static void main(String[] args) {
		System.out.println("Series printer");
		System.out.println("**************");
		System.out.println("Input your iterations");
		Scanner numberParser = new Scanner(System.in);
		int numberOfIterations = numberParser.nextInt();
		int[] array = new int[2000000];
		int iterationCounter = 0;
		int numberOfDigits = 0;
		int digitCounter =  0;
		array[0] = 1;
		String currentNumber = "1"; 
		int comboForOnes = 0;
		int comboForTwos = 0;
		int comboForThrees = 0;
		int processedOnes = 0;
		int processedTwos = 0;
		int processedThrees = 0;
		int[] combosForOne = new int[2000000];
		int[] combosForTwo = new int[2000000];
		int[] combosForThree = new int[2000000];
		boolean processedOne = false;
		boolean processedTwo = false;
		boolean processedThree = false;
		String[] arrayToChar = new String[2000000];
		while (iterationCounter < numberOfIterations) {
			try {
				currentNumber = Exercise01.giveMeTheNumber(array);
			} catch (NumberFormatException ex) {
				currentNumber = Exercise01.giveMeTheNumber(arrayToChar);
			}
			try {
				numberOfDigits = Exercise01.findTheDigits(Integer.parseInt(currentNumber)); 
			} catch (NumberFormatException ex) {
				numberOfDigits = Exercise01.findTheDigits(currentNumber);
			}
			while (digitCounter < numberOfDigits) {
				while (array[digitCounter] == 1) {
					comboForOnes++;
					combosForOne[processedOnes] = comboForOnes;
					digitCounter++;
					processedOne = true;
				}
				comboForOnes = 0;
				if (processedOne) {
					processedOnes++;	
				}
				processedOne = false;
				while (array[digitCounter] == 2) {
					comboForTwos++;
					combosForTwo[processedTwos] = comboForTwos;
					digitCounter++;
					processedTwo = true;
				}
				comboForTwos = 0;
				if (processedTwo) {
					processedTwos++;	
				}
				processedTwo = false;
				while (array[digitCounter] == 3) {
					comboForThrees++;
					combosForThree[processedThrees] = comboForThrees;
					digitCounter++;
					processedThree = true;
				}
				comboForThrees = 0;
				if (processedThree) {
					processedThrees++;	
				}
				processedThree = false;
				if (array[digitCounter] > 3) {
					digitCounter++;
				}
			}
			digitCounter = 0;
			System.out.println(currentNumber);
			int counterForCounters = 0;
			int arrayCounter = 0;
			int digitCount = 0;
			while (combosForOne[arrayCounter] != 0) {
				digitCount++;
				arrayCounter++;
			}
			arrayCounter = 0;
			while (combosForTwo[arrayCounter] != 0) {
				digitCount++;
				arrayCounter++;
			}
			arrayCounter = 0;
			while (combosForThree[arrayCounter] != 0) {
				digitCount++;
				arrayCounter++;
			}
			arrayCounter = 0;
			int counterOfDigits = 0;
			int counterForOne = 0;
			int counterForTwo = 0;
			int counterForThree = 0;
			int debugVar = 0;
			int arrayCounterSecond = 0;
			int[] backup = new int[array.length];
			backup = array;
			boolean exceptional = false;
			array = Exercise01.resetArray(array);
			while (counterOfDigits < digitCount) {
				debugVar = combosForOne[counterForOne];
					if (combosForOne[counterForOne] != 0) {
						if (combosForOne[counterForOne] > 3) {
							int counterForMinimizing = 0;
							while (counterForMinimizing < (int) combosForOne[counterForOne]/2) {
								array[arrayCounter] = 2;
								arrayCounter++;
								array[arrayCounter] = 1;
								arrayCounter++;
								counterForMinimizing++;
								counterOfDigits++;
							}
							exceptional = true;
							processedOne = true;
							counterForOne++;
						}
						if (!exceptional) {
							array[arrayCounter] = combosForOne[counterForOne];
							counterForOne++;
							arrayCounter++;
							processedOne = true;
							counterOfDigits++;
						}
					}
					if (processedOne) {
						array[arrayCounter] = 1;
						arrayCounter++;
					}	
					arrayCounterSecond++;
				
				counterForCounters = 0;
				processedOne = false;
				exceptional = false;

					if (combosForTwo[counterForTwo] != 0) {
						if (combosForTwo[counterForTwo] > 3) {
							int counterForMinimizing = 0;
							while (counterForMinimizing < (int) combosForTwo[counterForTwo]/2) {
								array[arrayCounter] = 2;
								arrayCounter++;
								array[arrayCounter] = 2;
								arrayCounter++;
								counterForMinimizing++;
								counterOfDigits++;
							}
							exceptional = true;
							processedTwo = true;
							counterForTwo++;
						}
						if (!exceptional) {
							array[arrayCounter] = combosForTwo[counterForTwo];
							counterForTwo++;
							arrayCounter++;
							processedTwo = true;
							counterOfDigits++;	
						}
					}
				if (processedTwo) {
					array[arrayCounter] = 2;
					arrayCounter++;
				}	
				arrayCounterSecond++;
				
			processedTwo = false;
			exceptional = false;
			counterForCounters = 0;
			
				if (combosForThree[counterForThree] != 0) {
					if (combosForThree[counterForThree] > 3) {
						int counterForMinimizing = 0;
						while (counterForMinimizing < (int) combosForThree[counterForThree]/2) {
							array[arrayCounter] = 2;
							arrayCounter++;
							array[arrayCounter] = 3;
							arrayCounter++;
							counterForMinimizing++;
							counterOfDigits++;
						}
						exceptional = true;
						processedThree = true;
						counterForThree++;
					}
					if(!exceptional) {
						array[arrayCounter] = combosForThree[counterForThree];
						counterForThree++;
						arrayCounter++;
						processedThree = true;
						counterOfDigits++;	
					}
				}
			if (processedThree) {
				array[arrayCounter] = 3;
				arrayCounter++;
			}	
			arrayCounterSecond++;
			
		exceptional = false;
		processedThree = false;
		counterForCounters = 0;
	}
	arrayCounter = 0;
	comboForOnes = 0;
	comboForTwos = 0;
	comboForThrees = 0;
	processedOnes = 0;
	processedTwos = 0;
	processedThrees = 0;
	iterationCounter++;
	combosForOne = Exercise01.resetArray(combosForOne);
	combosForTwo = Exercise01.resetArray(combosForTwo);
	combosForThree = Exercise01.resetArray(combosForThree);
	arrayToChar = Exercise01.giveMeTheCharArray(array);
}
}
}