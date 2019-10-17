public class Ex08pmb {
  public static void main(String[] args) {
  System.out.println("Hourglass printer");
  System.out.println("*****************");
  System.out.println("Input your initial height (higher than 3 and not a pair!)");
  int heightOfHourGlass = Integer.parseInt(System.console().readLine());
  while ((heightOfHourGlass % 2) == 0 || heightOfHourGlass == 1) {
    System.out.println("Non-valid input, the number needs to be higher than 3 and not a pair");
    heightOfHourGlass = Integer.parseInt(System.console().readLine());
  }
  int height = (heightOfHourGlass/2)+1;
  System.out.println("Input your character");
  String characterToPrint = System.console().readLine();
  char[] characterToPrintToCharArray = characterToPrint.toCharArray();
  char characterUsed = characterToPrintToCharArray[characterToPrintToCharArray.length-1];
  System.out.println("Input the increment on height");
  int heightIncrement = Integer.parseInt(System.console().readLine());
  while ((heightIncrement % 2) != 0) {
    System.out.println("Non-valid input, the number needs to be a pair");
    heightIncrement = Integer.parseInt(System.console().readLine());
  }
  System.out.println("Input the number of hourglasses to print");
  int hourglassNumber = Integer.parseInt(System.console().readLine());
  int elementCounter = 1;
  int totalNumberOfElements = 0;
  int auxiliarCounter = 1; 
  int auxiliarCounter2 = height;
  int counterForSymetryOfPyramid = 1;
  int numberOfHourGlasses = 0;
  // (1/2*heighthourglass)+1 = heightpyramid
  while (numberOfHourGlasses < hourglassNumber) { // This program prints hourglasses treating the hourglass as two independent pyramids which are meant to coincide, meaning that for each pyramid printed it calculates all properties for the other one and discards those of the first pyramid.
    while (elementCounter <= height) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements && counterForSymetryOfPyramid < height) {
      if (counterForSymetryOfPyramid > height) {
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
    while (elementCounter <= height) {
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    counterForSymetryOfPyramid = height;
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
    auxiliarCounter = 1;
    heightOfHourGlass += heightIncrement;
    height = (heightOfHourGlass/2)+1;
    auxiliarCounter2 = height;
    counterForSymetryOfPyramid = 1;
    elementCounter = 1;
    numberOfHourGlasses++;
  }
}
}
