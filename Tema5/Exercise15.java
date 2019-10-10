public class Exercise15 {
  public static void main(String[] args) {
    System.out.println("This program will ask for a base and a exponent so as to calculate the exponenth power of the base");
    System.out.println("Now, input the base");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("Now, input the exponent");
    double exponent = Double.parseDouble(System.console().readLine());
    double counter = 1;
    for (counter = 1; counter <= exponent; counter++) 
    System.out.printf("The %.0fº power to your base is %.2f\n",counter, Math.pow(base, counter));
  }
}
