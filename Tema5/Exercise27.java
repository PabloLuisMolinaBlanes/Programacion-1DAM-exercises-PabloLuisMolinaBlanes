public class Exercise27 {
  public static void main(String[] args) {
  System.out.println("This program is thought to get you multiples of 3 starting from 1, and ending with an inputted number");
  System.out.println("Input your number");
  int upperLimitNumber = Integer.parseInt(System.console().readLine());
  int counter;
  int numberCounter = 0;
  for (counter = 1; counter <= upperLimitNumber; counter++) {
    if ((counter % 3) == 0) {
      System.out.println(counter + " is a multiple of 3");
      numberCounter++;
    }
  }
  System.out.println("There are " + numberCounter + " multiples of 3 in this list");
  }
}
