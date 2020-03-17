package Tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		try {
			String file = "words";
			BufferedReader reader = new BufferedReader(new FileReader(file+".txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file+"_sort"+".txt"));
			String curr = "";
			while (curr != null) {
				while (!(curr.contains("/*"))); {
					if (!(curr.contains("//"))) {
					  System.out.println(curr);
					}
					curr = reader.readLine();
				}
				while (!(curr.contains("*/"))) {
					curr = reader.readLine();	
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
