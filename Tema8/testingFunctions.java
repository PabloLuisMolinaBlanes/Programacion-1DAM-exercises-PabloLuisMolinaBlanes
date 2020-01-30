package tema8;
public class testingFunctions {
	public static void main(String[] args) {
		int[] a = new int[10];
		a = Exercise01.randomizer(a, 100, 0);
		String b = Exercise01.decimalToBinary(9999);
		System.out.print(b);
	}
}
