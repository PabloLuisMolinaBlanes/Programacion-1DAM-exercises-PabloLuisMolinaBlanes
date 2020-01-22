package Tema9;

public class Terminal {
private int tiempo;
private String num;
public Terminal(String num) {
	this.num = num;
}
public String toString() {
	return "Nº " + this.num + " - " + this.getTiempo() + "s de conversacion";
}
public void llama(Terminal t, int temp) {
	this.setTiempo(this.getTiempo() + temp);
	t.setTiempo(t.getTiempo() + temp);
}
public int getTiempo() {
	return tiempo;
}
public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}
public String getNum() {
	return this.num;
}
}
