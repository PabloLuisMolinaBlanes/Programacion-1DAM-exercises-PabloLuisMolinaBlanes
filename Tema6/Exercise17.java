import java.util.Scanner;
public class Exercise17 {
	public static void main(String[] args) {
		Scanner inputter = new Scanner(System.in);
		System.out.println("Aquarium printer");
		System.out.println("****************");
		System.out.println("Input height of the aquarium");
		int aquariumHeight = inputter.nextInt();
		System.out.println("Now, input the width");
		int aquariumWidth = inputter.nextInt();
		int numberOfElements = aquariumHeight * aquariumWidth;
		int elementCounter = 0;
		int rowCounter = 0;
		int heightCounter = 1;
		int difference = 0;
		int whereDoWeGetTheFish = (int) ((Math.random()*(numberOfElements - aquariumWidth) + aquariumWidth));
		while ((whereDoWeGetTheFish + 1) % (aquariumWidth) == 0 || whereDoWeGetTheFish % aquariumWidth == 0 || whereDoWeGetTheFish > (numberOfElements - aquariumWidth)){
			whereDoWeGetTheFish = (int) ((Math.random()*(numberOfElements - aquariumWidth) + aquariumWidth));
		}
		while (elementCounter < numberOfElements) {
			while (rowCounter < aquariumWidth) {
				difference = aquariumWidth - rowCounter;
				if (difference == 1 || difference == aquariumWidth || heightCounter == 1 || heightCounter == aquariumHeight) {
					System.out.print("*"); 
					} else {
						if (whereDoWeGetTheFish == elementCounter) {
							System.out.print("&");
						} else {
							System.out.print(" ");	
						}		
					}
				elementCounter++;
				rowCounter++;
				}
			System.out.println("");
			rowCounter = 0;
			heightCounter++;
			}
		}
	}