package tema10;
import java.util.ArrayList;
public class Gestisimal {
private String codigo;
private String descripcion;
private double compra;
private double venta;
private int stock;
public Gestisimal (String c, String g, double t, double al, int au) {
	this.codigo = c;
	this.descripcion = g;
	this.compra = t;
	this.venta = al;
	this.stock = au;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getCompra() {
	return compra;
}
public void setCompra(double compra) {
	this.compra = compra;
}
public double getVenta() {
	return venta;
}
public void setVenta(double venta) {
	this.venta = venta;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public void sumStock(int q) {
	this.stock += q;
}
public void subStock(int q) {
	if((this.stock - q) < 0) {
		System.out.println("Cant take that much stock out");
	} else {
		this.stock -= q;	
	}
}
public String toString() {
	return "------------" + "\n" +  "Codigo: " + this.getCodigo() + "\n" + "compra: " + this.getCompra() + "\n" + "venta: " + this.getVenta() + "\n" + "stock: " + this.getStock() + "\n" + "descripcion: " + this.getDescripcion() + "\n" + "------------" + "\n";
}
}
