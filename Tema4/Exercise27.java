public class Exercise27 {
  public static void main(String[] args) {
    String saborTarta;
    String conNata;
    String tipoChocolate = "";
    double total = 0.00;
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    saborTarta = System.console().readLine();
    if (saborTarta.equalsIgnoreCase("chocolate")) {
    System.out.print("Qué tipo de chocolate quiere? (negro o blanco): ");
    tipoChocolate = System.console().readLine();  
    }
    System.out.println("");
    System.out.print("¿Quiere nata? (si o no): ");
    conNata = System.console().readLine();
    System.out.println("");
    System.out.print("¿Quiere ponerle un nombre? (si o no)?: ");
    String conNombre = System.console().readLine();
    System.out.println("");
    if (saborTarta.equalsIgnoreCase("chocolate")) {
      switch (tipoChocolate) {
        case "negro":
        System.out.println("Tarta de chocolate negro: 14,00 €");
        total = 14.00;
        break;
        case "blanco":
        System.out.println("Tarta de chocolate blanco: 15,00 €");
        total = 15.00;
        break;
        default:
        System.out.println("Tipo de chocolate inválido");
        break;
      }
  } else {
    switch (saborTarta) {
      case "manzana":
      System.out.println("Tarta de manzana: 18,00 €");
      total = 18.00;
      break;
      case "fresa":
      System.out.println("Tarta de fresa: 16,00 €");
      total = 16.00;
      break;
      default:
      System.out.println("Tarta inválida");
      break;
    }
  }
  if (conNombre.equalsIgnoreCase("si")) {
    System.out.println("Con nombre: 2,75 €");
    total += 2.75;
  }
  if (conNata.equalsIgnoreCase("si")) {
    System.out.println("Con nata: 2,50 €");
    total += 2.50;
  }
  System.out.printf("Total: %.2f €\n", total); 
}
}
