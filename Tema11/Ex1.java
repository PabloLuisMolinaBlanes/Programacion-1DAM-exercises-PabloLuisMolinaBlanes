package Tema11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Ex1 {

	public static void main(String[] args) {
		try {
			int currNumber = 1;
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			while (currNumber < 500) {
			boolean print =	isItAPrimeNumber(currNumber);
			if (print) {
				bw.write(currNumber+"\n");
			}
			currNumber++;
			}
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
	public static boolean isItAPrimeNumber(int n) {
		long theNumber = n;
		  double counter = theNumber-1;
		  boolean isItPrime = ((theNumber % (counter)) != 0);
		  for (counter = counter; counter > 1.0 && isItPrime == true; counter--) {
		  isItPrime = ((theNumber % counter) != 0.0);
		  }
		  return isItPrime;
		  }
}
