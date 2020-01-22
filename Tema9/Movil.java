package Tema9;

import Tema9.Movil.notValidRate;

public class Movil extends Terminal {
	private String tarifa;
	private int coste;
    class notValidRate extends Exception { 
	    public notValidRate(String errorMessage) {
	        super(errorMessage);
	    }
	}
	Exception notValidRate = new Exception();
public Movil(String numero, String tarifa) throws notValidRate {
	super(numero);
	this.coste = 0;
	if (!(tarifa.equals("bisonte") || tarifa.equals("mono") || tarifa.equals("rata"))) {
		throw new notValidRate("Incorrect rate: " + tarifa);		
	}
	else {
		this.tarifa = tarifa;
	}
}
public <T extends Movil> void llama(T terminal2, int temp) {
	double coste = this.tarifa.equals("rata") ? 0.06 : this.tarifa.equals("mono") ? 0.12 : this.tarifa.equals("bisonte") ? 0.3 : 0;
	this.setTiempo(this.getTiempo() + temp); 
	terminal2.setTiempo(terminal2.getTiempo() + temp);
	double costeFinal = coste * temp;
	this.coste += costeFinal;  
	costeFinal = 0;
}
@Override
public String toString() {
	return  "Nº " + this.getNum() + " - " + this.getTiempo() + "s de conversacion" + " - " + "tarifados " + this.coste + " euros";
}
}

