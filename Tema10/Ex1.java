package tema10;
import java.util.ArrayList;
import java.util.List;
public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> compas = new ArrayList<String>();
		compas.add("Pedro");
		compas.add("Miguel");
		compas.add("Fran");
		compas.add("Sergio");
		compas.add("Rodrigo");
		compas.add("Juan");
		int c = 0;
		for (String a : compas) {
			System.out.println(compas.get(c));
			c++;
		}
	}

}
