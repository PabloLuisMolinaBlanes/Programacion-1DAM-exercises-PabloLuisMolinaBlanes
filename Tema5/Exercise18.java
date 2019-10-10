public class Exercise18 {
  public static void main(String[] args) {
    System.out.println("This program is thought to get you all integers following two numbers in a particular way");
    System.out.println("Input your number");
    int number1 = Integer.parseInt(System.console().readLine());
    System.out.println("Input your other number");
    int number2 = Integer.parseInt(System.console().readLine());
    int counter;
    int difference = 6;
    for (counter = number1; counter <= number2; counter += 7) {
     System.out.println(counter);
    } 
  }
}
