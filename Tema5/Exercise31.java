public class Exercise31 {
  public static void main(String[] args) {
    System.out.println("'L' printer");
    System.out.println("************");
    System.out.println("Input a height");
    int height = Integer.parseInt(System.console().readLine());
    char symbol = '*';
    for (int counter = 0; counter < height - 1; counter++) {
      System.out.println(symbol);
    }
    for (int charCounter = 0; charCounter < ((height/2) + 1); charCounter++) {
      System.out.print(symbol);
    }
  }
}
