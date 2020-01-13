package tema7;
public class Exercise01 {
	public static void main(String[] args) {
		int[] array = new int[12];
		array[0] = 39;
		array[1] = -2;
		array[4] = 0;
		array[6] = 14;
		array[8] = 5;
		array[9] = 120;
		int counter = 0;
		while (counter < array.length) {
			System.out.print(array[counter] + " ");
			counter++;
		}
	} //What happens with uninitialized values in an array is that their value is their default, in the case of integers, it is '0'.
}
