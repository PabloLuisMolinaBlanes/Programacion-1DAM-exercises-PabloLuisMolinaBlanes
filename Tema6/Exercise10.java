
public class Exercise10 {
	public static void main(String[] args) {
		char chosenCharacter = '*';
		int numberChosen = (int) ((Math.random()*6)+1);
		int charactersPerLine = (int) ((Math.random()*40)+1);
		int numberOfLines = 10;
		int counterOfCharacters = 0;
		for (int counterOfLines = 0; counterOfLines <= numberOfLines; counterOfLines++) {
		if (numberChosen == 2) {
			chosenCharacter = '-';
		} else if (numberChosen == 3) {
			chosenCharacter = '=';
		} else if (numberChosen == 4) {
			chosenCharacter = '.';
		} else if (numberChosen == 5) {
			chosenCharacter = '|';
		} else if (numberChosen == 6) {
			chosenCharacter = '@';
		}
			for (counterOfCharacters = 0; counterOfCharacters <= charactersPerLine; counterOfCharacters++ ) {
				System.out.print("" + chosenCharacter);
				numberChosen = (int) ((Math.random()*6)+1);
				chosenCharacter = '*';
				if (numberChosen == 2) {
					chosenCharacter = '-';
				} else if (numberChosen == 3) {
					chosenCharacter = '=';
				} else if (numberChosen == 4) {
					chosenCharacter = '.';
				} else if (numberChosen == 5) {
					chosenCharacter = '|';
				} else if (numberChosen == 6) {
					chosenCharacter = '@';
				}
			}
			System.out.println("");
			charactersPerLine = (int) ((Math.random()*40)+1);
			chosenCharacter = '*';
		}
	}
}
