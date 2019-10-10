public class Exercise13 {
  public static void main(String[] args) {
    System.out.println("This program is thought to count positive and negative numbers from a list of ten numbers");
    System.out.println("Start inputting");
    int counter = 0;
    int[] numberArray = new int[11];
    boolean isItNegative;
    int counterOfNegatives = 0;
    int counterOfPositives = 0;
    while (counter < 10) {
      numberArray[counter] = Integer.parseInt(System.console().readLine());
      counter++;
    }
    for (counter = 0; counter < 10; counter++) {
      isItNegative = (numberArray[counter] < 0);
      if (isItNegative == true) {
        System.out.print(numberArray[counter] + ", ");
        counterOfNegatives++;
      } 
    }
    System.out.println( " -> " + counterOfNegatives +  " numbers are negative. "); 
    
    for (counter = 0; counter < 10; counter++) {
      isItNegative = (numberArray[counter] < 0);
      if (isItNegative == false) {
        System.out.print(numberArray[counter] + ", ");
        counterOfPositives++;
      } 
    }
        System.out.println( " -> " + counterOfPositives +  " numbers are positive. "); 
  }
}
