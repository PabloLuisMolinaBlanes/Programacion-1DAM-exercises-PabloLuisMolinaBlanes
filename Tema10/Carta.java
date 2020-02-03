package tema10;

public class Carta implements Comparable<Carta> {
enum Tipo { OROS, ESPADAS, COPAS, BASTOS};
Tipo[] tipos = Tipo.values();
Tipo tipo;
int numero;
public Carta() {
this.tipo = tipos[ (int) ((Math.random() * 4) + 0)];
this.numero = (int) ((Math.random() * 12) + 1);
}
public String toString() {
	return "" + this.numero + " de " + this.tipo;
}
@Override
public int compareTo(Carta arg0) {
	if (this.tipo.equals(arg0.tipo)) {
		 if (this.numero == arg0.numero) {
			 return 0;
		 }	if (this.numero < arg0.numero) {
				return -1;
		 } if (this.numero > arg0.numero) {
				return 1;
		 }
	} else if (!(this.tipo.equals(arg0.tipo))) {
		if (this.tipo.compareTo(arg0.tipo) < 0) {
			if (this.numero < arg0.numero) {
				return 2;
		 } if (this.numero > arg0.numero) {
				return 1;
		 } if (this.numero == arg0.numero) {
			 return 1;
		 } 
		} else if (this.tipo.compareTo(arg0.tipo) > 0) {
			if (this.numero < arg0.numero) {
				return -1;
		 } if (this.numero > arg0.numero) {
				return -2;
		 } if (this.numero == arg0.numero) {
			 return -1;
		 } 
		}	
	}
	return -999;
}
public int compareToCard(Carta arg0) {
	if (!(this.tipo.equals(arg0.tipo))) {
		return -1;
	} if (this.numero < arg0.numero) {
		return -1;
	} if (this.numero > arg0.numero) {
		return 1;
	} else {
		return 0;	
	}
}
}
