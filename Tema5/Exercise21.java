public class Exercise21 {
  public static void main(String[] args) {
    int number = 13;
    int sum = 0;
    int aux = 0;
    int counter = 0;
    double unevenSum = 0;
    int lastBiggestNumber = 0;
    System.out.println("This program is meant to calculate the average of a set of positive numbers");
    System.out.println("Input all your positive numbers, to stop the flow, input a negative one:");
    while (number > 0) {
      number = Integer.parseInt(System.console().readLine());
      if (number < 0) {
        continue;
      }
      if (number % 2 == 0) {
       if (lastBiggestNumber < number) {
       lastBiggestNumber = number;  
       } 
      } else {
       unevenSum += number; 
       aux++;
      }
      counter++;
    }
    System.out.println("You input " + counter + " numbers");
    System.out.println("Your uneven numbers average is " + unevenSum/aux);
    System.out.println("The biggest even number is " + lastBiggestNumber); 
    } 
  }
