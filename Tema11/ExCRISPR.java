package Tema11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class ExCRISPR {

	public static void main(String[] args) {
		System.out.println("CRISPR Generator.");
		System.out.println("-----------------");
		System.out.println("Have you been infe");
		System.out.println("cted by bacteria? ");
		System.out.println("Find its DNA strand ");
		System.out.println("and the CRISPR will");
		System.out.println("make sure you are n");
		System.out.println("ot infected again!");
		System.out.println();
		do {
			System.out.println("1. Create CRISPR");
			System.out.println("2. Print DNA strand");
			System.out.println("3. Find viric strands");
			System.out.println("4. Exit");
			int option = 0;
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please, input your CRISPR strand");
				sc.nextLine();
				String CRISPR = sc.nextLine();
				try {
					BufferedWriter writin = new BufferedWriter(new FileWriter("crisprTest.txt"));
					System.out.println("Your strand is " + CRISPR);
					System.out.println("Saving...");
					writin.write(CRISPR);
					writin.close();
				} catch (FileNotFoundException e) {
					System.out.println("Error writing file, file not found");
					System.out.println(e);
				
				} catch (IOException ioe) {
					System.out.println("Error writing file.");
					System.out.println(ioe);
				}
				
				break;
			case 2:
				System.out.println("Where is your DNA strand?");
				sc.nextLine();
				String location = sc.nextLine();
				try {
					BufferedReader readin = new BufferedReader(new FileReader(location));
					String read = readin.readLine();
					System.out.println(read);
				} catch (FileNotFoundException e) {
					System.out.println("Error reading file, file not found");
					System.out.println(e);
				
				} catch (IOException ioe) {
					System.out.println("Error reading file, although it was found");
					System.out.println(ioe);
				}
				break;
			case 3:
				System.out.println("Where is your DNA strand?");
				sc.nextLine();
				String locationCRIS = sc.nextLine();
				try {
					BufferedReader readin = new BufferedReader(new FileReader(locationCRIS));
					BufferedWriter writinRes = new BufferedWriter(new FileWriter("resultTest.txt"));
					String read = readin.readLine();
					char[] readToArray = read.toCharArray();
					String curr = "";
					System.out.println("Where is your CRISPR strand?");
					locationCRIS = sc.nextLine();
					BufferedReader strand = new BufferedReader(new FileReader(locationCRIS));
					String CRISPRstrand = strand.readLine();
					int length = CRISPRstrand.length();
					char[] CRISPRToChar = CRISPRstrand.toCharArray();
					int counterCRI = 0;
					int counter = 0;
					char currChar = CRISPRToChar[counterCRI];
					char currStrand = readToArray[counter];
					int position = 0;
					ArrayList<Integer> positions = new ArrayList<Integer>();
					while (counter < readToArray.length) {
						currStrand = readToArray[counter];
						if (currChar == currStrand) {
							position = counter;
							while (currChar == currStrand && counterCRI < CRISPRToChar.length-1) {
								counterCRI++;
								counter++;
								currChar = CRISPRToChar[counterCRI];
								currStrand = readToArray[counter];
							}
							if (counterCRI >= CRISPRToChar.length - 1 && currChar == currStrand) {
								positions.add(position);
							}
							counterCRI = 0;
							currChar = CRISPRToChar[counterCRI];
						}
						counter++;
					}
					ArrayList<Character> chars = new ArrayList<Character>();
					int elemCounter = 0;
					while (elemCounter < readToArray.length) {
						chars.add(readToArray[elemCounter]);
						elemCounter++;
					}
					for (Integer pos : positions) {
						int arrayCounter = pos;
						int lengthCounter = 0;
						while (lengthCounter < length) {
							chars.set(arrayCounter, 'n');
							lengthCounter++;
							if (arrayCounter <= readToArray.length-2) {
								arrayCounter++;	
							}
						}
					}
					String result = "";
					for (Character c : chars) {
						if (c == 65 || c == 67 || c == 71 || c == 84 || c == 85) {
							result += "" + c;
						} // 65 = 'A', 67 = 'C', 71 = 'G', 84 = 'T', 85 = 'U'
					}
					writinRes.write(result);
					writinRes.close();
				} catch (FileNotFoundException e) {
					System.out.println("Error reading file, file not found");
					System.out.println(e);
				
				} catch (IOException ioe) {
					System.out.println("Error reading file, although it was found");
					System.out.println(ioe);
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Option " + option + " not recongnized, choose between 1-4");
			}
		} while (true);
	}

}
