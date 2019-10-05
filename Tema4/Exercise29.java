public class Exercise29 {
  public static void main(String[] args) {
    String loComido;
    String loBebido;
    String tipoPitufo = "";
    double total = 0.00;
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    loComido = System.console().readLine();
    if (loComido.equalsIgnoreCase("pitufo")) {
    System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla) ");
    tipoPitufo = System.console().readLine();  
    }
    System.out.println("");
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    loBebido = System.console().readLine();
    System.out.println("");
    if (loComido.equalsIgnoreCase("pitufo")) {
      switch (tipoPitufo) {
        case "aceite":
        System.out.println("Pitufo de aceite: 1,20 €");
        total = 1.20;
        break;
        case "tortilla":
        System.out.println("Pitufo de tortilla: 1,60 €");
        total = 1.60;
        break;
        default:
        System.out.println("Tipo de pitufo inválido");
        break;
      }
  } else {
    switch (loComido) {
      case "palmera":
      System.out.println("Palmera: 1,40 €");
      total = 1.40;
      break;
      case "donut":
      System.out.println("Donut: 1,00 €");
      total = 1.00;
      break;
      default:
      System.out.println("Plato inválido");
      break;
    }
  }
  switch (loBebido) {
      case "zumo":
      System.out.println("Zumo: 1,50 €");
      total += 1.50;
      break;
      case "café":
      System.out.println("Café: 1,20 €");
      total += 1.20;
      break;
      default:
      System.out.println("Plato inválido");
      break;
    }
  System.out.printf("Total: %.2f €\n", total); 
}
}
