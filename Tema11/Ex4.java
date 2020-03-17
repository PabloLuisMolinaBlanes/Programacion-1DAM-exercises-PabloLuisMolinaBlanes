package Tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ex4 {

	public static void main(String[] args) {
		try {
			String file = "words";
			BufferedReader reader = new BufferedReader(new FileReader(file+".txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file+"_sort"+".txt"));
			String curr = "";
			ArrayList<String> arraylist = new ArrayList<String>();
			while (curr != null) {
				curr = reader.readLine();
				if (curr != null) {
					arraylist.add(curr);	
				}
			}
			Collections.sort(arraylist);
			for (String element : arraylist) {
				writer.write(element+"\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("This file does not exist");
		} catch (IOException ioe) {
			System.out.println("File found, although it could not be read.");
			System.out.println("Do you have permission to read it?");
		}	
	}

}
