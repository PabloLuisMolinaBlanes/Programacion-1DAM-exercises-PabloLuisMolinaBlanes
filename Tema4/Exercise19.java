import java.util.Scanner;
public class Exercise19 {
  public static void main(String[] args) {
    String numberWithLastDigit;
    Scanner sc = new Scanner(System.in);
    System.out.println("This program finds the number of digits in any integer");
    System.out.println("Input your wanted number");
    numberWithLastDigit = sc.nextLine();
    char[] arrayWithLastDigit = numberWithLastDigit.toCharArray();
    System.out.println("There are " + arrayWithLastDigit.length + " digits in your integer");
  }
}
    
    
