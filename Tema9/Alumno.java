package Tema9;
import java.util.Scanner;
public class Alumno {
double notaMedia;
String nombre;
public Alumno(String nombre, double notaMedia) {
	this.nombre = nombre;
	this.notaMedia = notaMedia;
}
public static Alumno[] setNombre(Alumno[] a, final int N) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Id poniendo nombres");
	for(int i = 0; i < N; i++) {
		a[i] = new Alumno(sc.nextLine(), 0.0);
	}
	return a;
}
public static Alumno[] setNota(Alumno[] a, final int N) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Id poniendo notas");
	for(int i = 0; i < N; i++) {
		System.out.println(a[i].nombre + ", pon nota");
		a[i] = new Alumno(a[i].nombre, Double.parseDouble(sc.nextLine()));
	}
	return a;
}
}
