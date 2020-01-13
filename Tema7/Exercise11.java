package tema7;
public class Exercise11 {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random()*100);
		int[] arrayOfRandomNumbers = new int[20];
		int primeCounter = 0;
		int nonPrimeCounter = 19;
		int currentDivisor = randomNumber - 1;
		if (currentDivisor == -1 || currentDivisor == 0) {
			currentDivisor = 1;
		}
		while (primeCounter < nonPrimeCounter) {
			currentDivisor = randomNumber - 1;
			if (currentDivisor == -1 || currentDivisor == 0) {
				currentDivisor = 1;
			}
			while (primeCounter < arrayOfRandomNumbers.length && nonPrimeCounter >= 0 && primeCounter < nonPrimeCounter) {
				currentDivisor = randomNumber - 1;
				while((randomNumber % currentDivisor) != 0 && currentDivisor > 1) {
					currentDivisor--;	
					}
				if (currentDivisor <= 1) {
				arrayOfRandomNumbers[primeCounter] = randomNumber;
				primeCounter++;
				randomNumber = (int) (Math.random()*100); 
			} else {
				arrayOfRandomNumbers[nonPrimeCounter] = randomNumber;
				nonPrimeCounter--;
				randomNumber = (int) (Math.random()*100); 	
			}
			
		} }
		int counter = 0;
		System.out.print("Array: ");
		while (counter < arrayOfRandomNumbers.length) {
			System.out.print(arrayOfRandomNumbers[counter]+" ");
			counter++;
		}
	}
}
		
	
	