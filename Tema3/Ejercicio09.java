import java.lang.Math;
public class Ejercicio09 {
	public static void main(String[] args) {
		double height;
		double radius;
		System.out.println("This program is thought to calculate the volume of a cone using the values of heigth and radius");
		System.out.println("So, please, give me the height");
		height = Double.parseDouble(System.console().readLine());
		System.out.println("Now, give me the radius of the base");
		radius = Double.parseDouble(System.console().readLine());
		double volume = (Math.PI*(radius*radius)*height)/3;
		System.out.printf("The volume is %.2f cubic units\n", volume);
	}
}
