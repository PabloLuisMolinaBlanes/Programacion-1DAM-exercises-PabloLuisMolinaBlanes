package Tema9;

public abstract class Inventario {
private String nombre;
private String codigo;
private int ano;
private boolean adquirido;
public Inventario(String c, String n, int a) {
	this.codigo = c;
	this.nombre = n;
	this.ano = a;
	this.adquirido = false;
}
public <T extends Inventario> void presta() {
	if (this.adquirido == true) {
		System.out.println("Sorry, already adquired");
	} else {
		this.adquirido = true;
		System.out.println("Book " + this.nombre + " has been acquired");
	}
}
public <T extends Inventario> void devuelve() {
	if (this.adquirido == true) {
		System.out.println("Got back " + this.nombre);
		this.adquirido = false;
	} else {
		System.out.println("Book not acquired yet");	
	}
}
public String toString() {
	String end = this.adquirido ? ")" : "no prestado)";
	return "ISBN " + this.codigo + " titulo - " + this.nombre + " ano de publicacion " + this.ano + " (" + end;
	
}
public boolean estaPrestado() {
	return this.adquirido;
}
public String getCodigo() {
	return this.codigo;
}
public String getNombre() {
	return this.nombre;
}
public int getAno() {
	return this.ano;
}
}
