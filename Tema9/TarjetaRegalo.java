package Tema9;

import java.io.PrintStream;

public class TarjetaRegalo {
double cantidad;
int numero;
class notEnoughMoney extends Exception {
	String string;
	public notEnoughMoney(String string) {
		this.string = string;
	}
}
public TarjetaRegalo(double cantidad) {
	this.cantidad = cantidad;
	this.numero = (int) ((Math.random() * 100000) + 10000);
}
public void gasta (double gasto) throws notEnoughMoney {
	try {
		if (this.cantidad < gasto) {
			throw new notEnoughMoney("Invalid spending value " + this.cantidad);
		} else {
			this.cantidad -= gasto;
		}	
	} catch (notEnoughMoney e) {
		System.out.println("Not enough money! (" + this.cantidad + " < " + gasto + ") Reversing transaction...");
		this.cantidad += gasto;
	}
}
public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta) {
	this.cantidad = tarjeta.cantidad += this.cantidad;
	double temp = this.cantidad;
	this.cantidad = 0;
	tarjeta.cantidad = 0;
	return new TarjetaRegalo(temp);
}
@Override
public String toString() {
	return String.format("Tarjeta nº " + this.numero + " - Saldo  %.2f", this.cantidad);
}
}
