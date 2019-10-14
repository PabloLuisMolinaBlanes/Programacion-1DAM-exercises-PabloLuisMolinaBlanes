import java.util.Arrays;
public class Exercise26 {
  public static void main(String[] args) {
    System.out.println("This program is meant to get you the position of a digit within a number");
    System.out.println("Input your number");
    String numberInputted = System.console().readLine();
    System.out.println("Input the wanted digit to find");
    String digitToFind = System.console().readLine();
    char[] digitToFindToCharArray = digitToFind.toCharArray();
    char digitToFindToChar = digitToFindToCharArray[digitToFindToCharArray.length - 1];
    char[] numberInputtedToCharArray = numberInputted.toCharArray();
    int counterForComponents = 0;
    char currentChar = numberInputtedToCharArray[counterForComponents];
    while (counterForComponents <= (numberInputtedToCharArray.length - 1)) {
     currentChar = numberInputtedToCharArray[counterForComponents]; 
     if (currentChar == digitToFindToChar) {
      System.out.println("Your wanted digit is in the position " + counterForComponents);
    }
    counterForComponents++; 
    }
  }
}
