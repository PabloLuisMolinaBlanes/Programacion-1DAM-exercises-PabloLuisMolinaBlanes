public class Exercise23 {
  public static void main(String[] args) {
    int number = 13;
    int sum = 0;
    int aux = 0;
    int counter = 0;
    double unevenSum = 0;
    int lastBiggestNumber = 0;
    System.out.println("This program is meant to calculate the average of a set of positive numbers");
    System.out.println("Input all your positive numbers, to stop the flow, input a negative one:");
    while (sum < 10000) {
      if (sum > 10000) {
        continue;  
      }
      number = Integer.parseInt(System.console().readLine());
      sum += number;
      counter++;
    }
    System.out.println("You input " + counter + " numbers");
    System.out.println("You final sum is " + sum);
    System.out.println("Your average is " + sum/counter);
    } 
  }
