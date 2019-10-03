public class Exercise14 {
  public static void main(String[] args) {
    try {
    double numberToAnalyze;
    System.out.println("This program is thought to tell you if your number is even and divisible by 5");
    System.out.println("Please, input your number");
    numberToAnalyze = Integer.parseInt(System.console().readLine());
    boolean isNumberEven = (numberToAnalyze % 2 == 0);
    boolean isNumberDivisibleBy5 = (numberToAnalyze % 5 == 0);
    if (isNumberEven == true) {
        if (isNumberDivisibleBy5 == true) {
          System.out.println("Your number is even and divisible by 5");
          System.exit(0);
    } else {
      System.out.println("Your number is even, not divisible by 5 though"); 
      System.exit(0);
   } 
  }
  
  if (isNumberDivisibleBy5 == true) {
        if (isNumberEven == true) {
          System.out.println("Your number is even and divisible by 5");
          System.exit(0);
    } else {
      System.out.println("Your number is divisible by 5, not even though");
      System.exit(0); 
   } 
  }
  
  if (isNumberDivisibleBy5 == false && isNumberEven == false) {
   System.out.println("Your number is neither divisble by 5 nor even"); 
}
} catch (NumberFormatException ex) {
  System.out.println("Invalid value, have you inputted a number?");
}
}
}

