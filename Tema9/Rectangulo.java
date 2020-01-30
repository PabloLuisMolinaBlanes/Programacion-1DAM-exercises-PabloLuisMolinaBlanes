package Tema9;

public class Rectangulo {
private int altura;
private int base;
private static int numero = 0;
public Rectangulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
	numero++;
}
@Override
public String toString() {
	int aquariumHeight = this.altura;
	int aquariumWidth = this.base;
	int elementCounter = 0;
	int rowCounter = 0;
	int heightCounter = 1; 
	int numberOfElements = aquariumHeight * aquariumWidth;
	while (elementCounter < numberOfElements) {
		while (rowCounter < aquariumWidth) {
			System.out.print("*"); 
			elementCounter++;
			rowCounter++;
			}
		System.out.println("");
		rowCounter = 0;
		heightCounter++;
		}
	return "";
}
public static int getRectangulosCreados() {
	return numero;
}

}
