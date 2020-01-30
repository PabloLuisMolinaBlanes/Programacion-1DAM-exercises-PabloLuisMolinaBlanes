package tema10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your numbers");
		ArrayList<String> names = new ArrayList<String>();
		int max = 10;
		int counter = 0;
		for (counter = 0; counter < max ; counter++) {
			names.add(sc.nextLine());
		}
		Collections.sort(names);
		System.out.println(names);
	}

}
