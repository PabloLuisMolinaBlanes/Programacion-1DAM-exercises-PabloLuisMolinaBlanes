public class Exercise39 {
  public static void main(String[] args) {
  System.out.println("Factorial calculator");
  System.out.println("**********************");
  System.out.println("Input an integer");
  long numberToFindTheFactorialOf = Integer.parseInt(System.console().readLine());
  long backwardsCounter = numberToFindTheFactorialOf - 1;
  long currentNumber = numberToFindTheFactorialOf * backwardsCounter;
  while (numberToFindTheFactorialOf > 0) {
  while (backwardsCounter > 2) {
    backwardsCounter--;
    currentNumber = currentNumber * backwardsCounter;
  }
  if (numberToFindTheFactorialOf == 1) {
      currentNumber = 1;
    }
  System.out.println("Your factorial for " + numberToFindTheFactorialOf + "! is: " + currentNumber);
  numberToFindTheFactorialOf--;
  backwardsCounter = numberToFindTheFactorialOf - 1;
  currentNumber = numberToFindTheFactorialOf * backwardsCounter;
  }
  }
}
