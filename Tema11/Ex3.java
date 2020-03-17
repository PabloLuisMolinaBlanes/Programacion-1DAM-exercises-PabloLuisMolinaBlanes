package Tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CombinedCat {

	public static void main(String[] args) {
		String curr = "";
		int currnum = 0;
		System.out.println("Input a file with numbers within the folder of the program, and calculate the average");
		Scanner sc = new Scanner(System.in);
		String file = sc.nextLine();
		System.out.println("Input your second file with numbers within the folder of the program, and calculate the average");
		String fileSecond = sc.nextLine();
		System.out.println("If you see this message without the program letting you input the second file, stop the program now.");
		sc.nextLine();
		int counter = 0;
		try {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		BufferedReader readerSecond = new BufferedReader(new FileReader(fileSecond));
		BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));
		String currSecond = "";
		int counterSecond = 0;
		reader.mark(1000);
		while (curr != null) {
			curr = reader.readLine();
			counter++;
		}
		reader.reset();
		counter--;
		readerSecond.mark(1000);
		while (currSecond != null) {
			currSecond = readerSecond.readLine();
			counterSecond++;
		}
		readerSecond.reset();
		counterSecond--;
		int max = counterSecond > counter ? counterSecond : counter;
		counter = 0;
		while (counter < max) {
			reader.mark(1000);
			if (reader.readLine() != null) {
				reader.reset();
				bw.write(reader.readLine() + "\n");
			}
			readerSecond.mark(1000);
			if (readerSecond.readLine() != null) {
				readerSecond.reset();
				bw.write(readerSecond.readLine() + "\n");
			}
			counter++;
		}
	} catch (FileNotFoundException e) {
		System.out.println("This file does not exist");
	} catch (IOException ioe) {
		System.out.println("File found, although it could not be read.");
		System.out.println("Do you have permission to read it?");
		System.out.println(ioe);
	}	
	}

}
