
public class Exercise25 {
  public static void main(String[] args) {
    System.out.println("This program will reverse the order of the digits of a number you specify");
    System.out.println("Input your number");
    String numberToReverse = System.console().readLine();
    char[] numberToReverseToCharArray = numberToReverse.toCharArray();
    char[] numberReversed = new char[numberToReverseToCharArray.length];
    int counterForComponents = (numberToReverseToCharArray.length - 1);
    int counterForComponentsFrom0 = 0;
    System.out.print("Your number reversed is "); 
    while (counterForComponents >= 0 && counterForComponentsFrom0 <= (numberToReverseToCharArray.length - 1)) {
    numberReversed[counterForComponentsFrom0] = numberToReverseToCharArray[counterForComponents];
    System.out.print(numberReversed[counterForComponentsFrom0]);
    if (counterForComponentsFrom0 < (numberToReverseToCharArray.length - 1)) { 
    counterForComponentsFrom0++;
  }
    counterForComponents--;
  }
}
}
