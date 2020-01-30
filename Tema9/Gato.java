package Tema9;
import java.util.Scanner;
public class Gato extends Animal {
	public Gato(double h, double w, String color, String n) {
		super(h, w, color, "Miauu", n);
	}
	public static Gato[] setNombre(Gato[] a, final int N) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id poniendo nombres");
		for(int i = 0; i < N; i++) {
			a[i] = new Gato(0.0, 0.0, "null", sc.nextLine());
		}
		return a;
	}
	public static Gato[] setColor(Gato[] a, final int N) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id poniendo color");
		for(int i = 0; i < N; i++) {
			a[i] = new Gato(0.0, 0.0, sc.nextLine(), a[i].getName());
		}
		return a;
	}
	public static Gato[] setAltura(Gato[] a, final int N) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id poniendo pesos");
		for(int i = 0; i < N; i++) {
			a[i] = new Gato(0.0, sc.nextDouble(), a[i].getColour(), a[i].getName());
		}
		return a;
	}
	public static Gato[] setPeso(Gato[] a, final int N) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Id poniendo alturas");
		for(int i = 0; i < N; i++) {
			a[i] = new Gato(sc.nextDouble(), a[i].getWeight(), a[i].getColour(), a[i].getName());
		}
		for(int i = 0; i < N; i++) {
			System.out.println(a[i]);
		}
		return a;
	}
	public static void getDatos(Gato[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public String toString() {
		return "Mi nombre es " + this.getName() + ", mido " + this.getHeight() + ", peso " + this.getWeight() + ", estoy " + this.getEmotion() +". Mi sonido es " + this.getSound();
	}
}
