public class Exercise25 {
  public static void main(String[] args) {
    double alturaBandera;
    double anchuraBandera;
    double IVA = 0.21;
    System.out.print("Introduzca la altura de la bandera en cm: ");
    alturaBandera = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.print("Ahora introduzca la anchura: ");
    anchuraBandera = Double.parseDouble(System.console().readLine());
    System.out.println("");
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudoBordado = System.console().readLine();
    System.out.println("");
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %.0f cm2: %.2f €\n",alturaBandera*anchuraBandera, alturaBandera*anchuraBandera*0.01);
    if (escudoBordado.equals("s")) {
    System.out.println("Con escudo: 2,50 € ");
  } else {
    System.out.println("Sin escudo: 0,00 €");
  } 
    System.out.println("Gastos de envío: 3,25 €");
    if (escudoBordado.equals("s")) {
    System.out.printf("Total: %.2f €\n", (alturaBandera * anchuraBandera * 0.01) + 3.25 + 2.50);
  } else {
    System.out.printf("Total: %.2f €\n", (alturaBandera*anchuraBandera * 0.01) + 3.25);
  }
}
}
