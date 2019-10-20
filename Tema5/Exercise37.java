public class Exercise37 {
  public static void main(String[] args) {
    System.out.println("Integer conversor to stick system");
    System.out.println("**********************************");
    System.out.println("Input a number in digit notation");
    String numberInputted = System.console().readLine();
    int digitsToFoundNumber = 0;
    char[] numberInputtedToCharArray = numberInputted.toCharArray();
    char currentDigit = ' ';
    int numberOfDigitsCounted = 0;
    for (int arrayCounter = 0; arrayCounter <= numberInputtedToCharArray.length-1; arrayCounter++) {
      currentDigit = numberInputtedToCharArray[arrayCounter];
      while (numberOfDigitsCounted < Integer.parseInt("" + currentDigit)) {
        System.out.print("|");
        numberOfDigitsCounted++;
      }
      if (arrayCounter < numberInputtedToCharArray.length-1) {
      System.out.print("-");
      numberOfDigitsCounted = 0;
    }
    }
}
}

