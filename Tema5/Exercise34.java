public class Exercise34 {
  public static void main(String[] args) {
    System.out.println("Number digit finder, printer and discriminator by evenness");
    System.out.println("**********************************************************");  
    System.out.println("Input the first number");
    String firstNumber = System.console().readLine();
    char[] firstNumberToCharArray = firstNumber.toCharArray();
    System.out.println("Input the second number");
    String secondNumber = System.console().readLine();
    char[] secondNumberToCharArray = secondNumber.toCharArray();
    int counter = 0;
    int difference = firstNumberToCharArray.length-secondNumberToCharArray.length;
    System.out.print("The even numbers are: ");
    if (difference == 0) {
    while (counter < firstNumberToCharArray.length && counter < secondNumberToCharArray.length) {
      if ((firstNumberToCharArray[counter] % 2) == 0) {
        System.out.print(firstNumberToCharArray[counter] + " ");
      }
      if ((secondNumberToCharArray[counter] % 2) == 0) {
        System.out.print(secondNumberToCharArray[counter] + " ");
      }
      counter++;
    }
    counter = 0;
    System.out.println("");
    System.out.print("The uneven numbers are: ");
    while (counter < secondNumberToCharArray.length && counter < firstNumberToCharArray.length) {
      if ((firstNumberToCharArray[counter] % 2) != 0) {
        System.out.print(firstNumberToCharArray[counter] + " ");
      }
      if ((secondNumberToCharArray[counter] % 2) != 0) {
        System.out.print(secondNumberToCharArray[counter] + " ");
      }
      counter++;
    }
    } 
  }
}
