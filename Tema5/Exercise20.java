
public class Exercise20 {
  public static void main(String[] args) {
    System.out.println("This program is thought to get you a pyramid based on an input height");
    System.out.println("Input height (an integer!)");
    int height = Integer.parseInt(System.console().readLine());
    System.out.println("Input the character you want your pyramid printed by");
    char[] characterArray = System.console().readLine().toCharArray(); 
    System.out.println("");
    char characterUsed = characterArray[characterArray.length-1];
    int elementCounter = 1;
    int totalNumberOfElements = 0;
    int auxiliarCounter = 1; 
    int auxiliarCounter2 = 1;
    int counterForSymetryOfPyramid = height;
    int difference; 
    while (elementCounter <= height) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements) {
    System.out.printf("%"+counterForSymetryOfPyramid+"s", " "); 
      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1))) {
        difference = (1+2*(auxiliarCounter2-1)) - auxiliarCounter;
        if (difference != 0 && difference != (2*(auxiliarCounter2-1)) &&  auxiliarCounter2 != 1 && auxiliarCounter2 != height) {
        System.out.print(" "); 
        auxiliarCounter++;
        elementCounter++; 
        } else {  
        System.out.printf("%c",characterUsed);
        auxiliarCounter++;
        elementCounter++;
      }
      }
      System.out.println("");
      auxiliarCounter2++;
      auxiliarCounter = 1;
      counterForSymetryOfPyramid--;
    }
  }
}

