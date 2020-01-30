package tema8;
import java.util.stream.*;
import java.util.Arrays;
import java.util.*;
public class Exercise01 {
	public static boolean isItPalindromic(String numberWithLastDigit) {
		char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
		int lengthOfTheArray;
		char[] palindromicArray = new char[numberWithLastDigit.length()];
		int aux = 0;
		for (lengthOfTheArray = arrayWithLastDigit.length; lengthOfTheArray >= 1; lengthOfTheArray--) {
			palindromicArray[aux] = arrayWithLastDigit[lengthOfTheArray - 1];
			aux++; 
		}
		boolean areBothArraysTheSame = Arrays.equals(arrayWithLastDigit,palindromicArray); 
		return areBothArraysTheSame;

	}
	public static String decimalToBinary(int d) {
		int[] number = new int[findTheDigits(d)*8];
		int reverseCounter = number.length-1;;
		while (d != 1 && d > 0) {
			number[reverseCounter] = d % 2;
			d /= 2;
			reverseCounter--;
		}
		number[reverseCounter] = 1;
		return generalGiveMeTheNumberForBinary(number);
	}
	public static boolean esPuntoDeSilla(int number, int[][] a) {
		int rowCounter = 0;
		int columnCounter = 0;
		while (columnCounter < a[rowCounter].length && a[rowCounter][columnCounter] > number ) {
			columnCounter++;
		}
		if (columnCounter < a.length) {
			return false;
		}
		columnCounter = 0;
		while(rowCounter < a.length && a[rowCounter][columnCounter] < number) {
			rowCounter++;
		}
		return rowCounter >= a.length;
	}
	public static int[] diagonal(String d, int[][] a, int r, int c) {
		int[][] arrayFirst = new int[a.length][a[0].length];
		int lengthCounter = 0;
		int columnCounter = 0;
		if (d.equals("nose")) {
			while(r < a.length && c < a[r].length) {
				arrayFirst[0][columnCounter] = a[r][c];
				r++;
				c++;
				lengthCounter++;
				columnCounter++;
			}	
		}
		if (d.equals("neso")) {
			while(r < a.length && c > 0) {
				arrayFirst[0][columnCounter] = a[r][c];
				r--;
				c--;
				lengthCounter++;
				columnCounter++;
			}
		}
		columnCounter = 0;
		int[] array = new int[lengthCounter];
		int arrayCounter = 0;
		if (d.equals("nose")) {
			r = 0;
			c = 0;
			while(columnCounter < a[r].length) {
				array[arrayCounter] = arrayFirst[0][columnCounter];
				columnCounter++;
				arrayCounter++;
			}	
		}
		if (d.equals("neso")) {
			r = 0;
			c = arrayFirst[r].length-1;
			while(columnCounter < a[r].length) {
				array[arrayCounter] = arrayFirst[0][columnCounter];
				columnCounter++;
				arrayCounter++;
			}
		}
		return array;
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
	public static long isItAPrimeNumber2(int n) {
		long theNumber = n;
		  double counter = theNumber-1;
		  boolean isItPrime = ((theNumber % (counter)) != 0);
		  while (true) {
		    if (isItPrime == false) {
		    isItPrime = true;  
		    }
		  while (counter > 1.0 && isItPrime == true) {
		  isItPrime = ((theNumber % counter) != 0.0);
		  counter--;
		  }
		  if (theNumber == 2 || theNumber == 1) {
		    return theNumber;
		    } else if (isItPrime == false) {
		    } else {
		    return theNumber; 
		    }
		  theNumber++;
		  counter = theNumber - 1;
		    }
	}
	public static double potency(int base, int exponent) {
		return Math.pow(base, exponent);
	}
	public static int findTheDigits(int n) {
	    double inputtedNumber = (double) n;
	    int numberOfDigits = 1;
	    while ((inputtedNumber * 10) % 10 != 0) {
	    inputtedNumber = inputtedNumber * 10;
	  }
	    while (inputtedNumber - 10 > 0) {
	    inputtedNumber = inputtedNumber / 10;
	    numberOfDigits++;
	    }
	    return numberOfDigits;
	  }
	public static int findTheDigits(String n) {
	    char[] charArray = n.toCharArray();
	    int numberOfDigits = 1;
	    while (numberOfDigits < charArray.length) {
	    	numberOfDigits++;
	    }
	    return numberOfDigits;
	  }
	public static int[] putNumberIntoArray(int[] a, String n, int d) {
		char[] numToChar = n.toCharArray();
		int arrayCounter = d-1;
		int counter = 0;
		while (counter < numToChar.length) {
		    a[counter] = Character.getNumericValue(numToChar[counter]);
		    counter++;
		    arrayCounter--;
		    }
		return a;
	}
	public static int voltea(String numberWithLastDigit) {
		char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
		int lengthOfTheArray;
		char[] palindromicArray = new char[numberWithLastDigit.length()];
		int aux = 0;
		for (lengthOfTheArray = arrayWithLastDigit.length; lengthOfTheArray >= 1; lengthOfTheArray--) {
			palindromicArray[aux] = arrayWithLastDigit[lengthOfTheArray - 1];
			aux++; 
		}
		aux = 0;
		String flippedNumber = "";
		for (lengthOfTheArray = arrayWithLastDigit.length; lengthOfTheArray >= 1; lengthOfTheArray--) {
			flippedNumber += "" + palindromicArray[aux];
			 aux++;
		}
		int flippedNumbertoInt = Integer.parseInt(flippedNumber);
		return flippedNumbertoInt;
	}
	public static int DigitN(String n, String d) {
	    String numberInputted = n;
	    String digitToFind = d;
	    char[] digitToFindToCharArray = digitToFind.toCharArray();
	    char digitToFindToChar = digitToFindToCharArray[digitToFindToCharArray.length - 1];
	    char[] numberInputtedToCharArray = numberInputted.toCharArray();
	    int counterForComponents = 0;
	    char currentChar = numberInputtedToCharArray[counterForComponents];
	    while (counterForComponents <= (numberInputtedToCharArray.length - 1)) {
	     currentChar = numberInputtedToCharArray[counterForComponents]; 
	     if (currentChar == digitToFindToChar) {
	      return counterForComponents;
	    } 
	    counterForComponents++; 
	    }
	    return -1;
	}
	public static int digitoN(String n, int pos) {
		char[] number = n.toCharArray();
		String numberFound = "" + number[pos];
		return Integer.parseInt(numberFound);
	}
	public static int quitaPorDetras(String n, int d) {
		int takenNumber = Integer.parseInt(n.substring(d,n.length()));
		return takenNumber;
	}
	public static int quitaPorDelante(String n, int d) {
		int reverseCounter = n.length() - d;
		int takenNumber = Integer.parseInt(n.substring(0,reverseCounter));
		return takenNumber;
	}
	public static String pegaPorDetras(String n, String d) {
		String takenNumber = d + "" + n;
		return takenNumber;
	}
	public static String pegaPorDelante(String n, String d) {
		String takenNumber = n + "" + d;
		return takenNumber;
	}
	public static String juntaNumeros(String n, String d) {
		String takenNumber = n + "" + d;
		return takenNumber;
	}
	public static int juntaNumeros(int i, String d, int f) {
		int takenNumber = Integer.parseInt(d.substring(i, f));
		return takenNumber;
	}
	public static String giveMeTheNumber(String[] a) {
		int counter = 0;
		String number = "";
		while (Integer.parseInt(a[counter]) != 0) {
			number += "" + a[counter];
			counter++;
		}
		return number;
	}
	public static int[] randomizer(int[] a, int max, int min) {
		int random = (int) (((Math.random())*max) + min);
		int counter = 0;
		while (counter < a.length) {
			a[counter] = random;
			counter++;
			random = (int) ((Math.random()*max) + min);
		}
		return a;
	}
	public static int[][] randomizer(int[][] a, int max, int min) {
		int random = (int) (((Math.random())*max) + min);
		int rowCounter = 0;
		int columnCounter = 0;
		while (rowCounter < a.length) {
			while (columnCounter < a[rowCounter].length) {
				a[rowCounter][columnCounter] = random;
				columnCounter++;
				random = (int) ((Math.random()*max) + min);
			}
			columnCounter = 0;
			rowCounter++;
		}
		return a;
	}
	public static int[] numberGiver(int[][] a, int numLooked) {
		int[] numberFound = new int[a[0].length]; 
		int rowCounter = 0;
		int columnCounter = 0;
		int[] error = {-1, -1};
		while (rowCounter < a.length-1 && a[rowCounter][columnCounter] != numLooked) {
			while (columnCounter < a[rowCounter].length-1 && a[rowCounter][columnCounter] != numLooked) {
				columnCounter++;
			}
			if (a[rowCounter][columnCounter] != numLooked) {
				columnCounter = 0;	
				rowCounter++;
			}
		}
		return a[rowCounter][columnCounter] == numLooked ? numberFound : error;
	}
	public static int[] returnerOfRow(int[][] a, int row) {
		return a[row];
	}
	public static int[] returnerOfColumn(int[][] a, int column) {
		int rowCounter = 0;
		int[] array = new int[a.length];
		int currentCounter = 0;
		while (rowCounter < a.length) {
			array[currentCounter] = a[rowCounter][column];
			rowCounter++;
			currentCounter++;
		}
		return array;
	}
	public static int findMaximum(int[] a) {
		int currentMaximum = Integer.MIN_VALUE;
		int counterOfNumbers = 0;
		int currentNumber = 0;
		while (counterOfNumbers < a.length) {
			currentNumber = a[counterOfNumbers];
			if (currentNumber > currentMaximum) {
				currentMaximum = currentNumber;
			}
			counterOfNumbers++;
		}
		return currentMaximum;
	}
	public static int findMinimum(int[] a) {
		int currentMinimum = Integer.MAX_VALUE;
		int counterOfNumbers = 0;
		int currentNumber = 0;
		while (counterOfNumbers < a.length) {
			currentNumber = a[counterOfNumbers];
			if (currentNumber < currentMinimum) {
				currentMinimum = currentNumber;
			}
			counterOfNumbers++;
		}
		return currentMinimum;
	}
	public static int medium(int[] a) {
		int totalSum = 0;
		int counterForNumbers = 0;
		while (counterForNumbers < a.length) {
			totalSum += a[counterForNumbers];
			counterForNumbers++;
		}
		return (totalSum/a.length);
	}
	public static boolean isItInside(int[] a, int looked) {
		int counter = 0;
		int currentNumber;
		while(counter < a.length && a[counter] != looked) {
			counter++;
		}
		return (counter >= a.length);
	}
	public static int findThePosition(int[] a, int looked) {
		int counter = 0;
		int currentNumber;
		while(counter < a.length && a[counter] != looked) {
			counter++;
		}
		return (counter >= a.length ? -1 : counter);
	}
	public static int[] volteador(int[] a) {
		int[] volteada = new int[a.length];
		int counter = 0;
		int reverseCounter = a.length-1;
		while (counter < a.length) {
			volteada[reverseCounter] = a[counter];
			counter++;
			reverseCounter--;
		}
		return volteada;
	}
	public static int[] desplazadorDerecha(int[] a, int iterations) {
		int counterForNumbers = a.length-1;
		int iterationCounter = 0;
		int lastDigit = a[a.length-1];
		while (iterationCounter < iterations) {
			while (counterForNumbers > 0) {
				a[counterForNumbers] = a[counterForNumbers-1];
				counterForNumbers--;
			}	
			a[0] = lastDigit;
			counterForNumbers = a.length-1;
			iterationCounter++;
		}
		return a;
	}
	public static int[] desplazadorIzquierda(int[] a, int iterations) {
		int counterForNumbers = 1;
		int iterationCounter = 0;
		int lastDigit = a[0];
		while (iterationCounter < iterations) {
			while (counterForNumbers < a.length) {
				a[counterForNumbers-1] = a[counterForNumbers];
				counterForNumbers--;
			}	
			a[0] = lastDigit;
			counterForNumbers = 1;
			iterationCounter++;
		}
		return a;
	}
	public static String giveMeTheNumber(int[] a) {
		int counter = 0;
		String number = "";
		while (a[counter] != 0) {
			number += "" + a[counter];
			counter++;
		}
		return number;
	}
	public static String generalGiveMeTheNumber(int[] a) {
		int counter = 1;
		String number = "";
		while (a[counter-1] != 0 && counter < a.length) {
			number += "" + a[counter];
			counter++;
		}
		return number;
	}
	public static String generalGiveMeTheNumberForBinary(int[] a) {
		int counter = 1;
		String number = "";
		while (counter < a.length) {
			number += "" + a[counter];
			counter++;
		}
		return number;
	}
	public static String[] giveMeTheCharArray(int[] a) {
		int counter = 0;
		String[] arrayToChar = new String[2000000];
		while (a[counter] != 0) {
			arrayToChar[counter] = "" + a[counter];
			counter++;
		}
		return arrayToChar;
	}
	public static void arrayPrinter(int[] a) {
		int counter = 0;
		while (counter < a.length) {
			System.out.print("" + a[counter] + " ");
			counter++;
		}
	}
	public static void arrayPrinter(String[] a) {
		int counter = 0;
		while (counter < a.length) {
			System.out.print("" + a[counter] + " ");
			counter++;
		}
	}
	public static void arrayPrinter(char[] a) {
		int counter = 0;
		while (counter < a.length) {
			System.out.print("" + a[counter] + " ");
			counter++;
		}
	}
	public static void arrayPrinter(double[] a) {
		int counter = 0;
		while (counter < a.length) {
			System.out.print("" + a[counter] + " ");
			counter++;
		}
	}
	public static void arrayPrinter(long[] a) {
		int counter = 0;
		while (counter < a.length) {
			System.out.print("" + a[counter] + " ");
			counter++;
		}
	}
	public static String[] generalGiveMeTheCharArray(int[] a) {
		int counter = 1;
		String[] arrayToChar = new String[a.length];
		while (a[counter-1] != 0 && counter < a.length) {
			arrayToChar[counter] = "" + a[counter];
			counter++;
		}
		return arrayToChar;
	}
	public static String[] resetArray(String[] a) {
		int counter = 0;
		while (Integer.parseInt(a[counter]) != 0) {
			a[counter] = "0";
			counter++;
		}
		return a;
	}
	public static int[] resetArray(int[] a) {
		int counter = 0;
		while (a[counter] != 0) {
			a[counter] = 0;
			counter++;
		}
		return a;
	}
}

