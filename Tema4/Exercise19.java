import java.util.Scanner;
public class Exercise19 {
  public static void main(String[] args) {
    String numberWithLastDigit;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program finds the number of digits in any integer (up to 5 digits)");
    System.out.println("Input your wanted number");
    numberWithLastDigit = sc.nextLine();
    char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
    if (arrayWithLastDigit.length > 5) {
      System.out.println("Up to 5 digits only, sorry");
  } else {
    System.out.println("There are " + arrayWithLastDigit.length + " digits in your integer");
  }
  }
}
    
    
