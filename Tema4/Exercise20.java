import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays.*;
import java.util.*;
public class Exercise20 {
  public static void main(String[] args) {
    String numberWithLastDigit;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program finds if any integer is palindromic");
    System.out.println("Input your wanted number");
    numberWithLastDigit = sc.nextLine();
    if (numberWithLastDigit.length() > 5) {
      System.out.println("There are more than 5 digits, try again");
  } else {
    char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
    int lengthOfTheArray;
    char[] palindromicArray = new char[numberWithLastDigit.length()];
    int aux = 0;
    for (lengthOfTheArray = arrayWithLastDigit.length; lengthOfTheArray >= 1; lengthOfTheArray--) {
     palindromicArray[aux] = arrayWithLastDigit[lengthOfTheArray - 1];
     aux++; 
   }
   boolean areBothArraysTheSame = Arrays.equals(arrayWithLastDigit,palindromicArray); 
    if (areBothArraysTheSame == true) {
     System.out.println("It is a palindromic number "); 
  } else {
    System.out.println("It is not a palindromic number"); 
  }
  }
}
}
    
    
