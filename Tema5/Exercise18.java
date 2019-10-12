public class Exercise18 {
  public static void main(String[] args) { // Disclaimer: This program is thought to increment its counter by 7 units each loop if it applies. It is a feature, not a bug.
    System.out.println("This program is thought to get you all integers following two numbers in a particular way");
    System.out.println("Input your number");
    int number1 = Integer.parseInt(System.console().readLine());
    System.out.println("Input your other number");
    int number2 = Integer.parseInt(System.console().readLine());
    if (number1 == number2) {
      System.out.println("Invalid values, they cannot be equal.");
      System.exit(1);
    }
    int counter = number1;
    if (number2-number1 == 1) {
      counter = number1+1;
        System.out.println(counter-1); 
        System.out.println(counter);
        System.exit(0);
       } else if (number2-number1 == 2) {
        counter = number1+2; 
        System.out.println(counter-2);
        System.out.println(counter-1);  
        System.out.println(counter);
        System.exit(0);
       } else if (number2-number1 == 3) {
         counter = number1+3;
        System.out.println(counter-3); 
        System.out.println(counter-2);
        System.out.println(counter-1);  
        System.out.println(counter);
        System.exit(0);
       } else if (number2-number1 == 4) {
         counter = number1+4;
        System.out.println(counter-4); 
        System.out.println(counter-3); 
        System.out.println(counter-2);
        System.out.println(counter-1);  
        System.out.println(counter);
        System.exit(0);
       } else if (number2-number1 == 5) {
         counter = number1+5;
        System.out.println(counter-5); 
        System.out.println(counter-4); 
        System.out.println(counter-3); 
        System.out.println(counter-2);
        System.out.println(counter-1);  
        System.out.println(counter);
        System.exit(0);
       } else if (number2-number1 == 6) {
         counter = number1+6;
        System.out.println(counter-6); 
        System.out.println(counter-5);
        System.out.println(counter-4); 
        System.out.println(counter-3); 
        System.out.println(counter-2);
        System.out.println(counter-1);  
        System.out.println(counter);
        System.exit(0);
       }
       System.out.println(number1);
    while (counter < number2) {
     counter += 7; // Dont change the 7, it's actually meant to be that way because of the constraints of the exercise.
     if (counter > number2) {
     int difference = counter-number2;
     counter -= difference;
   }
     System.out.println(counter-6);
     System.out.println(counter-5);
     System.out.println(counter-4);
     System.out.println(counter-3);
     System.out.println(counter-2);
     System.out.println(counter-1);
     System.out.println(counter);
       } 
     }
    } 
