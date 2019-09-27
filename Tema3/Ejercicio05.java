public class Ejercicio05 {
	public static void main(String[] args) {
		double height;
		double width;
		System.out.println("We're calculating the area of a rectangle");
		System.out.println("So, please, give me the height");
		height = Double.parseDouble(System.console().readLine());
		System.out.println("Now, give me the width");
		width = Double.parseDouble(System.console().readLine());
		System.out.printf("The area is approximately %.3f square units\n",height*width);
	}
}
