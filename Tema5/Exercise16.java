public class Exercise16 { // Do not actually do it like this, not optimized at all.
  public static void main(String[] args) {
  System.out.println("This program is thought to show you if some number is prime (tentative to say, I know)");
  System.out.println("Now, input your number");
  long theNumber = Integer.parseInt(System.console().readLine());
  double counter = theNumber-1;
  boolean isItPrime = ((theNumber % (counter)) != 0);
  for (counter = counter; counter > 1.0 && isItPrime == true; counter--) {
  isItPrime = ((theNumber % counter) != 0.0);
  }
  if (theNumber == 2 || theNumber == 1) {
    System.out.println("This number is prime");
    } else if (isItPrime == false) {
     System.out.println("This number is not prime"); 
    } else {
      System.out.println("This number is prime"); 
    }
  } 
}
