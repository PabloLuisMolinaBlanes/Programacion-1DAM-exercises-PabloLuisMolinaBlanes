package tema7;
import java.util.Scanner;
public class Exercise14 {
	static int limit = 8;
	 static String[] names = new String[1000];
	public static void main(String[] args) {
		Scanner nameParser = new Scanner(System.in);
		System.out.println("Input eight names of objects");
		int arrayCounter = 0;
		int auxiliarArrayCounter = 0;
		int reverseArrayCounter = limit-1;
		String currentName = "";
		while (auxiliarArrayCounter <= limit-1) {
			currentName = nameParser.nextLine();
			if(currentName.equals("azul") || currentName.equals("rojo") || currentName.equals("morado") || currentName.equals("naranja") || currentName.equals("rosa") || currentName.equals("verde") || currentName.equals("amarillo") || currentName.equals("blanco") || currentName.equals("negro")) {
			names[arrayCounter] = currentName;
			arrayCounter++;
			} else {
			names[reverseArrayCounter] = currentName;
			reverseArrayCounter--;
			}
			auxiliarArrayCounter++;
		}
		String allNames = nameParser(names);
		int charCounter = 0;
		while (charCounter < allNames.length()*2) {
			System.out.print("-");
			charCounter++;
		}
		System.out.println();
		arrayCounter = 0;
		while (arrayCounter < limit) {
			System.out.print(names[arrayCounter]+"|");
			arrayCounter++;
		}
		System.out.println();
		charCounter = 0;
		while (charCounter < allNames.length()*2) {
			System.out.print("-");
			charCounter++;
		}
	}
	
	public static String nameParser(String[] array) {
		String currentString = "";
		int arrayCounter = 0;
		while (arrayCounter < limit) {
			currentString += names[arrayCounter] + "";
			arrayCounter++;
		}
		return currentString;
	}
	
}
