public class Exercise08 {
  public static void main(String[] args) {
    double numberToMultiplicate;
    System.out.println("This program is meant to find any multiplication table for the number inputted");
    System.out.println("Input your number");
    int currentMultiplicatedNumber;
    numberToMultiplicate = Double.parseDouble(System.console().readLine());
    System.out.printf("The multiplication table for %.0f\n", numberToMultiplicate);
    for (currentMultiplicatedNumber = 1; currentMultiplicatedNumber <= 10; currentMultiplicatedNumber++) {
      System.out.printf("%d: %.0f\n", currentMultiplicatedNumber, numberToMultiplicate*currentMultiplicatedNumber);
    }
  }
}
