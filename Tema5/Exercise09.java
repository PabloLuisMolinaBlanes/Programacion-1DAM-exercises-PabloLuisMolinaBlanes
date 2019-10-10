public class Exercise09 {
  public static void main(String[] args) {
    System.out.println("This program is meant to find the digits of a number");
    System.out.println("Please, input your number");
    double inputtedNumber = Double.parseDouble(System.console().readLine());
    int numberOfDigits = 1;
    while ((inputtedNumber * 10) % 10 != 0) {
    inputtedNumber = inputtedNumber * 10;
  }
    while (inputtedNumber - 10 > 0) {
    inputtedNumber = inputtedNumber / 10;
    numberOfDigits++;
    }
    System.out.println("There are " + numberOfDigits + " digits in your number");
  }
}
