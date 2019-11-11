package tema7;
import java.util.Scanner;
import java.util.HashMap;
public class Exercise08 {
public static void main(String[] args) {
	System.out.println("Average temperatures Grapher");
	System.out.println("****************************");
	double[] temperatures = new double[12];
	Scanner tempParser = new Scanner(System.in);
	HashMap<Integer, String> months = new HashMap<Integer,String>();
	months.put(0, "Jan");
	months.put(1, "Feb");
	months.put(2, "Mar");
	months.put(3, "Apr");
	months.put(4, "May");
	months.put(5, "Jun");
	months.put(6, "Jul");
	months.put(7, "Aug");
	months.put(8, "Sep");
	months.put(9, "Oct");
	months.put(10, "Nov");
	months.put(11, "Dec");
	System.out.println("Type in the average temperatures for each month of the year (January-December)");
	int typedCounter = 0;
	while (typedCounter < temperatures.length) {
		temperatures[typedCounter] = tempParser.nextDouble();
		typedCounter++;
	}
	int graphCounter = 0;
	typedCounter = 0;
	while (graphCounter < temperatures.length) {
		System.out.print(months.get(graphCounter) + ": ");
		while (typedCounter < temperatures[graphCounter]) {
			System.out.print("*");
			typedCounter++;
		}	
		System.out.println("");
		graphCounter++;
		typedCounter = 0;
	}
	}
}
