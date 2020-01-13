package tema7;
public class Exercise02 {
	public static void main(String[] args) {
		char[] array = new char[12];
		array[0] = 'a';
		array[1] = 'x';
		array[4] = '@';
		array[6] = ' ';
		array[8] = '+';
		array[9] = 'Q';
		int counter = 0;
		while (counter < array.length) {
			System.out.print(array[counter] + " ");
			counter++;
		}
	} //What happens with uninitialized values in an array is that their value is their default, in the case of String, it is '\00000'.
}