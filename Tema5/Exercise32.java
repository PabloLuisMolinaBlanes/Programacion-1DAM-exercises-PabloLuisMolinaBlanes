public class Exercise32 {
  public static void main(String[] args) {
    System.out.println("Even digits from inputted integer finder and adder");
    System.out.println("**************************************************");
    System.out.println("Input your integer");
    int[] evenList = new int[100000];
    long inputtedLong = Long.parseLong(System.console().readLine());
    int substractor = 9;
    int counter = 0;
    int digit;
    while (inputtedLong > 1) {
      if ((inputtedLong % 2) == 0) {
        inputtedLong -= substractor;
          while ((inputtedLong % 10) != 0) {
            inputtedLong += substractor;
            substractor--;
            inputtedLong -= substractor;
          }
        inputtedLong += substractor;
        evenList[counter] = substractor;
        substractor = 9;  
        counter++;
        }
        inputtedLong = inputtedLong / 10;
      } 
      int numbersFound = counter;
      System.out.print("Your even digits are ");
      for (counter = numbersFound; counter >= 0; counter--) {
        if (counter != numbersFound) {
        System.out.print(evenList[counter] + " ");
      }
    }
    counter = 0;
    System.out.println("");
    System.out.print("Their sum is ");
    int sum;
    for (sum = 0; counter <= numbersFound; counter++) {
        sum += evenList[counter];
      }
      System.out.print(sum);
    }
  }
