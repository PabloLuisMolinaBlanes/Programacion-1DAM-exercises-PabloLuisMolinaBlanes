package Tema9;

public class Pizza {
	private String tipo;
	private String tamano;
	private String estado = "pedida";
	private static int pedidas = 0;
	private static int servidas = 0;
public Pizza(String tipo, String tamano) {
	this.tipo = tipo;
	this.tamano = tamano;
	this.estado = "pedida";
	pedidas += 1;
}
public void sirve() {
if(this.estado == "servida") {
	
} else {
	this.estado = "servida";
	servidas += 1;	
}
}
public String toString() {
	return "pizza " + this.tipo + " " + this.tamano + "," + this.estado;

}
public static int getTotalServidas() {
return servidas;
}
public static int getTotalPedidas() {
return pedidas;	
}
}
