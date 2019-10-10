public class Exercise12 {
  public static void main(String[] args) {
    System.out.println("This program is thought to calculate a number 'n' of the fibunacci number series values");
    System.out.println("Input 'n'");
    int n = Integer.parseInt(System.console().readLine());
    long number1 = 0;
    long number2 = 1;
    long number3 = 1;
    long result = number1 + number2;
    int counter = 0;
    System.out.print("0 ");
    while (counter <= n) {
      System.out.print(result + " ");
      result = number1 + number2;
      number1 = result;
      counter++;
      if (counter == n) {
        break;
      }
      System.out.print(result + " ");
      result = number1 + number2;
      number2 = result;
      counter++;
      if (counter == n) {
        break;
      }
    }
  }
}
