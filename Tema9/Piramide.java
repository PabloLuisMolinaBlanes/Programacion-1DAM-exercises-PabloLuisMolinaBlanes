package Tema9;

public class Piramide extends Figura {
private int height;
private static int piramidesCreadas = 0;
public Piramide(int height) {
this.height = height;	
piramidesCreadas++;
}
public String toString() {
		    int height = this.height;
		    char characterUsed = '*';
		    int elementCounter = 1;
		    int totalNumberOfElements = 0;
		    int auxiliarCounter = 1; 
		    int auxiliarCounter2 = 1;
		    int counterForSymetryOfPyramid = height;
		    while (elementCounter <= height) {
		      totalNumberOfElements += (1+2*(elementCounter-1));
		      elementCounter++; 
		    }
		    elementCounter = 0;
		    while (elementCounter < totalNumberOfElements) {
		    System.out.printf("%"+counterForSymetryOfPyramid+"s", "\u00A0"); // Whitespace character
		      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1))) {
		        System.out.printf("%c",characterUsed);
		        auxiliarCounter++;
		        elementCounter++;
		      }
		      System.out.println("");
		      auxiliarCounter2++;
		      auxiliarCounter = 1;
		      counterForSymetryOfPyramid--;
		    }
		    return "";
		  }
public static int getPiramidesCreadas() {
	return piramidesCreadas;
}
}
