public class Exercise28 {
  public static void main(String[] args) {
  System.out.println("Factorial calculator");
  System.out.println("**********************");
  System.out.println("Input an integer");
  int numberToFindTheFactorialOf = Integer.parseInt(System.console().readLine());
  int backwardsCounter = numberToFindTheFactorialOf - 1;
  int currentNumber = numberToFindTheFactorialOf * backwardsCounter;
  while (backwardsCounter > 2) {
    backwardsCounter--;
    currentNumber = currentNumber * backwardsCounter;
  }
  System.out.println("Your factorial is " + currentNumber);
  }
}
