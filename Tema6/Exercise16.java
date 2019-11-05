import java.util.HashMap;
public class Exercise16 {
	public static void main(String[] args) {
		HashMap<Integer, String> randomSlots = new HashMap<Integer, String>();
		randomSlots.put(1, "corazón");
		randomSlots.put(2, "diamante");
		randomSlots.put(3, "herradura");
		randomSlots.put(4, "campana");
		randomSlots.put(5, "limón");
		System.out.println("Slot machine");
		System.out.println("************");
		int currentSlotFirst = (int) (Math.random()*5) + 1;
		int currentSlotSecond = (int) (Math.random()*5) + 1;
		int currentSlotThird =  (int) (Math.random()*5) + 1;
		System.out.println(randomSlots.get(currentSlotFirst) + " " + randomSlots.get(currentSlotSecond) + " " + randomSlots.get(currentSlotThird));
		if (currentSlotFirst == currentSlotSecond && currentSlotFirst == currentSlotSecond && currentSlotSecond == currentSlotThird) {
			System.out.println("Congratulations, you have won 10 coins!");
		} else if (currentSlotFirst != currentSlotSecond && currentSlotFirst != currentSlotThird && currentSlotSecond != currentSlotThird) {
			System.out.println("Sorry, you did lose this time!");
		} else {
			System.out.println("You have recovered your coin");
		}
	}
}
