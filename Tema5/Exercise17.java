public class Exercise17 {
  public static void main(String[] args) {
    System.out.println("This program is thought to add 100 numbers following one positive integer inputted");
    System.out.println("Input any positive integer");
    int numberToBringTheNext = Integer.parseInt(System.console().readLine());
    int sum = numberToBringTheNext + 1;
    int total = sum;
    int counter = 0;
    while (counter <= 100 && numberToBringTheNext > 0) {
    total += sum;
    sum += 1;
    counter++;
    }
    if (numberToBringTheNext < 0) {
      System.out.println("Invalid input");
      System.exit(1);
    }
    System.out.print("Your result is " + total);
  }
}
