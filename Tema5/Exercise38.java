public class Exercise38 {
  public static void main(String[] args) {
  System.out.println("Hourglass printer");
  System.out.println("***********");
  System.out.println("Input height (an integer!)");
  int height = Integer.parseInt(System.console().readLine());
  if ((height < 3) || ((height % 2) == 0) || height == 1) {
    while (height < 3 || (height % 2) == 0 || height == 1) {
      System.out.println("Error, the number must be higher than 3 and not a pair!");
      height = Integer.parseInt(System.console().readLine());
    }
  }
  int heightOfPyramid = ((height/2)+1);
  System.out.println("Input the character you want your pyramid printed by");
  char[] characterArray = System.console().readLine().toCharArray(); 
  System.out.println("");
  char characterUsed = characterArray[characterArray.length-1];
  int elementCounter = 1;
  int totalNumberOfElements = 0;
  int auxiliarCounter = 1; 
  int auxiliarCounter2 = heightOfPyramid;
  int counterForSymetryOfPyramid = 1;
  int difference; 
    while (elementCounter <= heightOfPyramid) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements && counterForSymetryOfPyramid < heightOfPyramid) {
      if (counterForSymetryOfPyramid > heightOfPyramid) {
        continue;
    }
    System.out.printf("%"+counterForSymetryOfPyramid+"s", "\u00A0"); // Whitespace character
      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1))) {
        System.out.printf("%c",characterUsed);
        auxiliarCounter++;
        elementCounter++;
      }
      System.out.println("");
      auxiliarCounter2--;
      auxiliarCounter = 1;
      counterForSymetryOfPyramid++;
    }
    auxiliarCounter = 1; 
    auxiliarCounter2 = 1;
    elementCounter = 1;
    while (elementCounter <= heightOfPyramid) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    counterForSymetryOfPyramid = heightOfPyramid;
    while (elementCounter < totalNumberOfElements && counterForSymetryOfPyramid > 0) {
      if (counterForSymetryOfPyramid < 0 ) {
        continue;
    }
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
    System.out.println("");
  }
}

