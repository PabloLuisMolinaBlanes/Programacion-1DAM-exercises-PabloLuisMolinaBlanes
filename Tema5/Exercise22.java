public class Exercise22 { // Do not actually do it like this, not optimized at all.
  public static void main(String[] args) {
  System.out.println("This program is thought to show you if some number is prime (tentative to say, I know)");
  System.out.println("Now, input your number");
  long theNumber = Integer.parseInt(System.console().readLine());
  double counter = theNumber-1;
  boolean isItPrime = ((theNumber % (counter)) != 0);
  while (counter > 0.0) {
    if (isItPrime == false) {
    isItPrime = true;  
    }
  while (counter > 1.0 && isItPrime == true) {
  isItPrime = ((theNumber % counter) != 0.0);
  counter--;
  }
  if (theNumber == 2 || theNumber == 1) {
    System.out.println(theNumber);
    System.out.println("This number is prime");
    } else if (isItPrime == false) {
    } else {
      System.out.println(theNumber);
      System.out.println("This number is prime"); 
    }
  theNumber--;
  counter = theNumber - 1;
    }
  } 
}
