public class Exercise40 {
  public static void main(String[] args) {
  System.out.println("Romboid printer");
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
  int auxiliarCounter2 = 1;
  int counterForSymetryOfPyramid = heightOfPyramid;
  int difference; 
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
        difference = (1+2*(auxiliarCounter2-1)) - auxiliarCounter;
        if (difference != 0 && difference != (2*(auxiliarCounter2-1)) &&  auxiliarCounter2 != 1) {
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
    auxiliarCounter = 1; 
    auxiliarCounter2 = heightOfPyramid;
    counterForSymetryOfPyramid = 1;
    elementCounter = 0;
    while (elementCounter <= heightOfPyramid) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements && counterForSymetryOfPyramid <= heightOfPyramid) {
      if (counterForSymetryOfPyramid > heightOfPyramid) {
        continue;
    }
    System.out.printf("%"+counterForSymetryOfPyramid+"s", "\u00A0"); // Whitespace character
      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1))) {
        difference = (1+2*(auxiliarCounter2-1)) - auxiliarCounter;
        if (difference != 0 && difference != (2*(auxiliarCounter2-1))) {
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
      auxiliarCounter2--;
      auxiliarCounter = 1;
      counterForSymetryOfPyramid++;
    }
    auxiliarCounter = 1; 
    auxiliarCounter2 = 1;
    elementCounter = 1;
  }
}

