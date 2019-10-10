public class Exercise10 {
  public static void main(String[] args) {
    int number = 13;
    int sum = 0;
    int aux = 1;
    System.out.println("This program is meant to calculate the average of a set of positive numbers");
    System.out.println("Input all your positive numbers, to stop the flow, input a negative one:");
    while (number > 0) {
      number = Integer.parseInt(System.console().readLine());
      sum += number;
      aux++;
    }
    System.out.println("Tu media es " + sum/aux);
  }
}
