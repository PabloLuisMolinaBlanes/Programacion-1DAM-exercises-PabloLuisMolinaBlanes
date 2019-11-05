import java.util.HashMap;
public class Exercise18 {
public static void main(String[] args) {
	HashMap<Integer,String> colours = new HashMap<Integer,String>();
	colours.put(1,"red");
	colours.put(2,"blue");
	colours.put(3,"yellow");
	colours.put(4,"green");
	colours.put(5,"violet");
	colours.put(6,"orange");
	int randomColorFirst = (int) ((Math.random() * 6)+1);
	int randomColorSecond = (int) ((Math.random() * 6)+1);
	int randomColorThird = (int) ((Math.random() * 6)+1);
	while (randomColorFirst == randomColorSecond || randomColorFirst == randomColorThird || randomColorSecond == randomColorThird) {
		 randomColorFirst = (int) ((Math.random() * 6)+1);
		 randomColorSecond = (int) ((Math.random() * 6)+1);
		 randomColorThird = (int) ((Math.random() * 6)+1);
	}
	System.out.println(colours.get(randomColorFirst) + " " + colours.get(randomColorSecond) + " " + colours.get(randomColorThird));
	}
}
