package Tema9;
import java.util.Scanner;
public class init {
	public static void main(String[] args) {
	do {
    System.out.println("Horse menu");
    System.out.println("----------");
    System.out.println("What do you wish to do?");
    System.out.println("1. Create a horse");
    System.out.println("2. Stare at a horse");
    System.out.println("3. Make your horse sing");
    System.out.println("4. Create a new animal (not implemented yet!)");
    System.out.println("5. Exit");
    Caballo horsey = new Caballo(1,1,"1","1");
    Pinguino pingu = new Pinguino(1,1,"1","1");
    
    Scanner textParser = new Scanner(System.in);
    int option = textParser.nextInt();
    switch (option) {
    case 1:
    	System.out.println("Choose the name");
    	String name = textParser.next();
    	System.out.println("Choose the weight");
    	double weight = textParser.nextDouble();
    	System.out.println("Choose the height");
    	double height = textParser.nextDouble();
    	System.out.println("Choose the color");
    	String color = textParser.next();
    	horsey = new Caballo(height,weight,color,name);
    	break;
    case 2:
    	horsey.stare();
    	break;
    case 3:
    	horsey.makeSound();
    	break;
    case 5:
    	System.out.println("Bye");
    	System.exit(0);
    	break;
    	default:
    	System.out.println("Please, choose a valid option (1-5)");
    }
	} while (true);
	}

}
