package Tema9;

public class Fraccion {
double numerador;
double denominador;
public String toString() {
	return "   " + this.numerador + "\n" + "__________" + "\n\n" + "   " + this.denominador + "\n";
}
public void invierte() {
	double temp = this.numerador;
	this.numerador = this.denominador;
	this.denominador = temp;
}
public Fraccion(double n, double d) {
	this.numerador = n;
	this.denominador = d;
}
public double divide() {
	return this.numerador/this.denominador;
}
public void multiplica(Fraccion f) {
	this.numerador =  this.numerador * f.numerador;
	this.denominador = this.denominador * f.denominador;
}
}
