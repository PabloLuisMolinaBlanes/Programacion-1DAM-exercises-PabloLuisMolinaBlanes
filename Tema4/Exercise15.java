public class Exercise15 {
  public static void main(String[] args) {
    int option;
    char[] characterArrayUsed;
    char characterUsed;
    System.out.println("This program will print a pyramid according to where you want it to point at");
    System.out.println("                                    Menu");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println("                              1. Point upwards");
    System.out.println("                              2. Point downwards");
    System.out.println("                              3. Point right");
    System.out.println("                              4. Point left");
    while (true) {
    option = Integer.parseInt(System.console().readLine());
    switch (option) {
      case 1:
      System.out.println("Please, choose your symbol");
      characterArrayUsed = System.console().readLine().toCharArray();
      characterUsed = characterArrayUsed[characterArrayUsed.length-1];
      System.out.printf("%7s\n %7s\n %8s\n %9s\n %10s\n","" + characterUsed,"" + characterUsed + characterUsed + characterUsed,"" + characterUsed + characterUsed + characterUsed + characterUsed+ characterUsed,"" + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed,"" + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed);
      break;
      case 2:
      System.out.println("Please, choose your symbol");
      characterArrayUsed = System.console().readLine().toCharArray();
      characterUsed = characterArrayUsed[characterArrayUsed.length-1];
      System.out.printf("%11s\n %9s\n %8s\n %7s\n %6s\n","" + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed,"" + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed + characterUsed,"" + characterUsed + characterUsed + characterUsed + characterUsed+ characterUsed,"" + characterUsed + characterUsed + characterUsed,"" + characterUsed);
      break;
      case 3:
      System.out.println("Please, choose your symbol");
      characterArrayUsed = System.console().readLine().toCharArray();
      characterUsed = characterArrayUsed[characterArrayUsed.length-1];
      System.out.println("");
      System.out.println(characterUsed);
      System.out.println("" + characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed+characterUsed);
      System.out.println("" + characterUsed+characterUsed);
      System.out.println(characterUsed);
      break;
      case 4:
      System.out.println("Please, choose your symbol");
      characterArrayUsed = System.console().readLine().toCharArray();
      characterUsed = characterArrayUsed[characterArrayUsed.length-1];
      System.out.println("");
      System.out.println("    "+characterUsed);
      System.out.println("   "+characterUsed+characterUsed);
      System.out.println("  "+characterUsed+characterUsed+characterUsed);
      System.out.println(" "+characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println(""+characterUsed+characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println(" "+characterUsed+characterUsed+characterUsed+characterUsed);
      System.out.println("  "+characterUsed+characterUsed+characterUsed);
      System.out.println("   "+characterUsed+characterUsed);
      System.out.println("    "+characterUsed);
      break;
      default:
      System.out.println("Wrong option");
  }
  if (option == 1 || option == 2 || option == 3 || option == 4) {
  break;
  } 
  }
  }
}
