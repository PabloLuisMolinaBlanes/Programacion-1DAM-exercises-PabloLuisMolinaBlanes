package Tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class Ex6 {

	public static void main(String[] args) {
		try {
			String file = args[0];
			String query = args[1];
			int current = 0;
			int counter = 0;
			int found = 0;
			int size = query.length();
			BufferedReader reader = new BufferedReader(new FileReader(file+".txt"));
			BufferedReader stepByStep = new BufferedReader(new StringReader(""));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file+"_sort"+".txt"));
			String curr = "";
			while (curr != null) {
				curr = reader.readLine();
				if (curr == null) {
					break;
				}
				stepByStep = new BufferedReader(new StringReader(curr));
				current = stepByStep.read();
				char[] querying = query.toCharArray();
				char currentChar = (char) current;
				char[] currentArray = new char[size]; 
				currentArray[counter] = currentChar;
				while (currentArray[counter] == querying[counter] && counter < querying.length) {
					counter++;
					if (counter >= querying.length) {
						break;
					}
					current = stepByStep.read();
					currentChar = (char) current;
					currentArray[counter] = currentChar;
				}
				if (counter >= querying.length) {
					found++;
				}
				counter = 0;
				int spaceCharacterInASCII = 32;
				while (current != spaceCharacterInASCII && current != -1) {
					current = stepByStep.read();
				}
		}
			System.out.println(found);
			} catch (FileNotFoundException e) {
				System.out.println("This file does not exist");
			} catch (IOException ioe) {
				System.out.println("File found, although it could not be read.");
				System.out.println("Do you have permission to read it?");
			}	
		}
	}	
