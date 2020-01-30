package tema10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your numbers");
		ArrayList<Integer> integers = new ArrayList<Integer>();
		int max = 10;
		int counter = 0;
		for (counter = 0; counter < max ; counter++) {
			integers.add(sc.nextInt());
		}
		Collections.sort(integers);
		System.out.println(integers);
	}

}
