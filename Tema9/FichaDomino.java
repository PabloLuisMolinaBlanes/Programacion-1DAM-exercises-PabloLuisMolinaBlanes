package Tema9;

public class FichaDomino {
int izquierda;
int derecha;
public FichaDomino(int i, int d) {
this.izquierda = i;
this.derecha = d;
}
@Override
public String toString() {
	return "["+this.izquierda+"|"+this.derecha+"]";
}
public String voltea() {
	int temp = this.izquierda;
	this.izquierda = this.derecha;
	this.derecha = temp;
	return "["+this.izquierda+"|"+this.derecha+"]";
}
public boolean encaja(FichaDomino f) {
		if (f.derecha == this.derecha || f.derecha == this.izquierda) {
			return true;
		} 
		if (f.izquierda == this.izquierda || f.izquierda == this.derecha) {
			return true;
		}
		return false;
	}
}

