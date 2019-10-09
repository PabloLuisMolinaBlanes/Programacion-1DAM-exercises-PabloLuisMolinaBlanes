public class Exercise07 {
  public static void main(String[] args) {
    String combination = "3200"; // Don't actually embed account info in the source code of your program, please 
    int numberOfAttempts = 0;
    String attemptedCombination;
    System.out.println("SECURITY SYSTEM");
    System.out.println("****************");
    System.out.println("Input the combination");
    while (numberOfAttempts != 4) {
      attemptedCombination = System.console().readLine();
      if (attemptedCombination.equals(combination)) {
        System.out.println("The safe has been succesfully opened");
        break;
    } else {
        System.out.println("Incorrect password");
        numberOfAttempts++;
    }  
  }
  if (numberOfAttempts >= 4) {
    System.out.println("Too many failed attempts, closing");
  }
}
}
