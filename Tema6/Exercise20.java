import java.util.Scanner;
public class Exercise20 {
	public static void main(String[] args) {
		Scanner inputter = new Scanner(System.in);
		System.out.println("Barrel printer");
		System.out.println("****************");
		System.out.println("Input height of the barrel");
		int aquariumHeight = inputter.nextInt();
		int aquariumWidth = 6;
		int numberOfElements = aquariumHeight * aquariumWidth;
		int elementCounter = 0;
		int rowCounter = 0;
		int heightCounter = aquariumHeight;
		int difference = 0;
		int whereDoWeGetTheFish = (int) ((Math.random()*aquariumHeight)+1);
		if (whereDoWeGetTheFish == 1) {
			whereDoWeGetTheFish = 2;
		}
		while (elementCounter < numberOfElements) {
			while (rowCounter < aquariumWidth) {
				difference = aquariumWidth - rowCounter;
				if (difference == 1 || difference == aquariumWidth || heightCounter == 1) {
					System.out.print("*"); 
					} else {
						if (whereDoWeGetTheFish == heightCounter) {
							System.out.print("=");
						} else {
							System.out.print(" ");	
						}		
					}
				elementCounter++;
				rowCounter++;
				}
			System.out.println("");
			rowCounter = 0;
			heightCounter--;
			}
			System.out.println("There are " + whereDoWeGetTheFish + " liters of water.");
		
		
		
		}
}
