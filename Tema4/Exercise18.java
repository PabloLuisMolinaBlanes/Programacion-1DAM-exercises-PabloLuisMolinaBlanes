import java.util.Scanner;
public class Exercise18 {
  public static void main(String[] args) {
    String numberWithLastDigit;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program finds the first digit of any integer");
    System.out.println("Input your wanted number");
    numberWithLastDigit = sc.nextLine();
    char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
    if (arrayWithLastDigit.length > 5) {
      System.out.println("Up to 5 digits only, sorry");
  } else {
    System.out.println("Your wanted digit is " + arrayWithLastDigit[0]);
  }
  }
}
    
    
