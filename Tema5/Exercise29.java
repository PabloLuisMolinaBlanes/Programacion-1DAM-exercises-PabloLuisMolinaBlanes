public class Exercise29 {
  public static void main(String[] args) {
    System.out.println("This program is thought to find all positive numbers lower than one that is inputted if they are not divisible by another inputted number");
    System.out.println("Input the number to start the counting from (1 or beyond)");
    int numberInputted = Integer.parseInt(System.console().readLine());
    System.out.println("Input the number to divide the number inputted by");
    int numberToModTheInputted = Integer.parseInt(System.console().readLine());
    while (numberInputted > 0) {
        numberInputted--;
        if ((numberInputted % numberToModTheInputted) != 0) {
          System.out.println("One number not divisible by " + numberToModTheInputted + " is " + numberInputted);
        }
      }
    }
  }
