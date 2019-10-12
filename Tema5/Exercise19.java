
public class Exercise19 {
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
    while (elementCounter <= height) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements) {
    System.out.printf("%"+counterForSymetryOfPyramid+"s", "\u00A0"); // Whitespace character
      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1))) {
        System.out.printf("%c",characterUsed);
        auxiliarCounter++;
        elementCounter++;
      }
      System.out.println("");
      auxiliarCounter2++;
      auxiliarCounter = 1;
      counterForSymetryOfPyramid--;
    }
  }
}

