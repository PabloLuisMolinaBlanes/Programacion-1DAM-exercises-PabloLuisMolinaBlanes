
public class Exercise12 {
	public static void main(String[] args) {
		char characterUsed = (char)(Math.random()*255);
		int numberOfCharacters = (int) ((Math.random()*10000)+1000);
		for (int counterOfCharacters = 0; counterOfCharacters <= numberOfCharacters; counterOfCharacters++) {
			System.out.print(characterUsed);
			characterUsed = (char)(Math.random()*255);
		}
	}
}
