public class Exercise33 {
  public static void main(String[] args) {
    System.out.println("'U' printer");
    System.out.println("************");
    System.out.println("Input the height");
    int height = Integer.parseInt(System.console().readLine());
    int charCounter = 0;
    int counter = 1;
    int numberOfSpaces = (height/2)+1;
    while (charCounter < (height - 1)) {
    while (counter <= 2) {
      System.out.printf("%s", "*");
      System.out.printf("%"+numberOfSpaces+"s", " ");
      counter++;
    }
    System.out.println("");
    counter = 1;
    charCounter++;
  }
   charCounter = 0;
   System.out.print(" ");
   while (charCounter < numberOfSpaces) {
     System.out.print("*");
     charCounter++;
   }
}
}
