package Tema9;
public class Linea {
Punto p1;
Punto p2;
public Linea (Punto p1, Punto p2) {
this.p1 = p1;
this.p2 = p2;
}
public String toString() {
	return "L�nea formada por los puntos " + this.p1 + " y " + this.p2;
}
}
