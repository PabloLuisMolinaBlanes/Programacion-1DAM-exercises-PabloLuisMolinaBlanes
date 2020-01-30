package tema10;
import java.util.ArrayList;
import java.util.List;
public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int limit = (int) ((Math.random() * 20)+10);
		int counter = 0;
		for (counter = 0; counter < limit ; counter++ ) {
			nums.add( (int) (Math.random() * 100));
		}
		int sum = 0;
		counter = 0;
		for (int a : nums) {
			sum += nums.get(counter);
			counter++;
		}
		int media = sum/counter;
		counter = 0;
		int min = 100;
		for (int a : nums) {
			if (nums.get(counter) < min) {
				min = nums.get(counter); 
			}
			counter++;
		}
		counter = 0;
		int max = 0;
		for (int a : nums) {
			if (nums.get(counter) > max) {
				max = nums.get(counter); 
			}
			counter++;
		}
		counter = 0;
		System.out.println(sum);
		System.out.println(media);
		System.out.println(max);
		System.out.println(min);
		}
	}
