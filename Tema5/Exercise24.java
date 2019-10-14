
public class Exercise24 {
  public static void main(String[] args) {
    System.out.println("This program is thought to get you a pyramid based on an input height");
    System.out.println("Input height (an integer!)");
    int height = Integer.parseInt(System.console().readLine());
    int elementCounter = 1;
    int totalNumberOfElements = 0;
    int auxiliarCounter = 1; 
    int auxiliarCounter2 = 1;
    int counterForSymetryOfPyramid = height + 1;
    int currentCharachterToBeInput = 1;
    int currentCharacterToBeAdded = 0;
    boolean surpassedHalf = false;
    while (elementCounter < height) { // Gives the total number of elements to print for the pyramid
      totalNumberOfElements += (1+2*(elementCounter-1));
      elementCounter++; 
    }
    elementCounter = 0;
    while (elementCounter < totalNumberOfElements) { 
      System.out.printf("%"+counterForSymetryOfPyramid+"s", " "); 
      while (auxiliarCounter <= (1+2*(auxiliarCounter2-1)) && (currentCharacterToBeAdded+currentCharachterToBeInput) >= 1) { // I got a bit cargo-cult here, will try to study it more later.
        if (surpassedHalf) {
          currentCharacterToBeAdded--;
        if (currentCharachterToBeInput + currentCharacterToBeAdded == 0) { // I tried in all sorts of ways to avoid using continue, so that it wouldn't add a final '0' ending the pyramid, included using backspaces, changing the loop requisites for it looping, etc. Will look more onto it later, as of now it will stay like that.
            continue;
          }
          System.out.printf("%d", currentCharachterToBeInput + currentCharacterToBeAdded); 
        } else {
          System.out.printf("%d", currentCharachterToBeInput + currentCharacterToBeAdded);
          currentCharacterToBeAdded += 1;
        }
        if ((currentCharachterToBeInput + currentCharacterToBeAdded) > ((1+2*(auxiliarCounter2-1))/ 2) && auxiliarCounter2 != 1) { // Checks whether half the elements for that line has been printed.
          System.out.printf("%d", currentCharachterToBeInput + currentCharacterToBeAdded);
          surpassedHalf = true;
        }
        elementCounter++;
        auxiliarCounter++;
        }
      System.out.println("");
      auxiliarCounter2++;
      auxiliarCounter = 1;
      currentCharacterToBeAdded = 0;
      counterForSymetryOfPyramid--;
      surpassedHalf = false;
      }
    }
  }

