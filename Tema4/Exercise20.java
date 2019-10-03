import java.util.Scanner;
public class Exercise17 {
  public static void main(String[] args) {
    String numberWithLastDigit;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program finds the last digit of any integer");
    System.out.println("Input your wanted number");
    numberWithLastDigit = sc.nextLine();
    char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
    System.out.println("Your wanted digit is " + arrayWithLastDigit[arrayWithLastDigit.length - 1]);
  }
}
    
    
