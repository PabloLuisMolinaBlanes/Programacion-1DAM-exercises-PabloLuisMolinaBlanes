package Tema9;

public abstract class Vehiculo {
private int kilometraje;
private static int kilometrajetotal;
int peso;
int tamano;
String marca;
public Vehiculo(int p, int t, String m) {
this.peso = p;
this.tamano = t;
this.marca = m;
}
public void setKilometraje(int kilometros) {
	this.kilometraje += kilometros;
	kilometrajetotal += kilometros;
}
@Override
public String toString() {
	return "Soy un(a) " + this.getClass().getSimpleName() + ", y recorri " + this.kilometraje + " kilometros"; 
}
public void getKilometraje() {
	System.out.println("Mi kilometraje es " + this.kilometraje + " kilometros");
}
public void getKilometrajeTotal() {
	System.out.println(kilometrajetotal + " kilometros entre todos");
}
}
