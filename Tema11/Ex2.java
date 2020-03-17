package Tema11;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		String curr = "";
		int currnum = 0;
		System.out.println("Input a file with numbers within the folder of the program, and calculate the average");
		Scanner sc = new Scanner(System.in);
		String file = sc.nextLine();
		int counter = 0;
		try {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		while (curr != null) {
			curr = reader.readLine();
			if (curr != null) {
				System.out.println(curr);
				counter++;	
			}
		}
	} catch (FileNotFoundException e) {
		System.out.println("This file does not exist");
	} catch (IOException ioe) {
		System.out.println("File found, although it could not be read.");
		System.out.println("Do you have permission to read it?");
	}	
	}

}
