package Tema9;

public class CuentaCorriente {
int saldo;
String numeroDeCuenta;
public CuentaCorriente(int saldo) {
this.saldo = saldo;
this.numeroDeCuenta = "" + (int) (Math.random()*10000) + "" + (int) (Math.random()*10000);
}
public CuentaCorriente() {
this.saldo = 0;
this.numeroDeCuenta = "" + (int) (Math.random()*10000) + "" + (int) (Math.random()*10000);
}
@Override
public String toString() {
	return "Número de cta: " + this.numeroDeCuenta + " Saldo: " + this.saldo + " €";
}
public void ingreso(int cantidad) {
	this.saldo += cantidad;
}
public void cargo(int cantidad) {
	this.saldo -= cantidad;
}
public void transferencia(CuentaCorriente c, int cantidad) {
	this.saldo -= cantidad;
	c.saldo += cantidad;
}
}
