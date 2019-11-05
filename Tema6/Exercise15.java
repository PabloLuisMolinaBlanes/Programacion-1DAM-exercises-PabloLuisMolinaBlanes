import java.util.HashMap;
public class Exercise15 {
	public static void main(String[] args) {
		HashMap<Integer, String> musicalNotes = new HashMap<Integer, String>();
		musicalNotes.put(1, "do");
		musicalNotes.put(2, "re");
		musicalNotes.put(3, "mi");
		musicalNotes.put(4, "fa");
		musicalNotes.put(5, "sol");
		musicalNotes.put(6, "la");
		musicalNotes.put(7, "si");
		System.out.println("Melody Generator");
		System.out.println("****************");
		int randomMusicalTone = (int) ((Math.random() * 7)+1);
		int numberOfMusicalTones = (int) ((Math.random() * 29)+4);
		int firstNote = randomMusicalTone;
		int musicalNoteCounter = 0;
		int counterToAssureSeparation = 0;
		while (musicalNoteCounter <= numberOfMusicalTones-3) {
			if (counterToAssureSeparation != 4) {
				System.out.print(musicalNotes.get(randomMusicalTone) + " ");
				counterToAssureSeparation++;
				musicalNoteCounter++;
			} else {
				System.out.print(" | ");
				counterToAssureSeparation = 0;
			}
			randomMusicalTone = (int) ((Math.random() * 7)+1);
		}
		System.out.printf("%s ||", musicalNotes.get(firstNote));
	}
}
