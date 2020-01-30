package Tema9;

public class Incidencia {
private int puesto;
private String incidencia;
private static int currentCode = 1;
private int code = 0;
private String estado;
private static int pendientes = 0;
public Incidencia(int p, String i) {
	this.code = currentCode;
	currentCode++;
	pendientes++;
	this.puesto = p;
	this.incidencia = i;
	this.estado = "Pendiente";
}
public void resuelve(String m) {
	this.estado = "Resueta - " + m;
	pendientes--;
}
public String toString() {
	return "Incidencia " + this.code + " - Puesto " + this.puesto + " - " + this.incidencia + " - " + this.estado;
}
public static int getPendientes() {
	return pendientes;
}
}
