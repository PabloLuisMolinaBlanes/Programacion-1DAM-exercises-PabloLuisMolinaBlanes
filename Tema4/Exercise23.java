import java.util.HashMap;
public class Exercise23 {
  public static void main(String[] args) {
    double baseImponible;
    HashMap<String, Double> codigosPromo = new HashMap<String, Double>();
    codigosPromo.put("nopro", 1.0);
    codigosPromo.put("mitad", 0.5);
    codigosPromo.put("meno5", 5.0);
    codigosPromo.put("cincoporc", 0.95);
    HashMap<String, Double> IVAs = new HashMap<String, Double>();
    IVAs.put("general", 0.21);
    IVAs.put("reducido", 0.1);
    IVAs.put("superreducido", 0.04);
    String codigoDescuento; 
    String tipoIVA;
  System.out.print("Introduzca la base imponible: ");
  baseImponible = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca el tipo de IVA: ");
  tipoIVA = System.console().readLine();
  System.out.print("Introduzca el código de descuento: ");
  codigoDescuento = System.console().readLine();
  double IVAPorBaseImponible = IVAs.get(tipoIVA) * baseImponible;
  double IVAMasBaseImponible = IVAPorBaseImponible + baseImponible;
  double IVAMasBaseImponibleYDescuento = IVAMasBaseImponible * codigosPromo.get(codigoDescuento);
  if (codigosPromo.get(codigoDescuento) == 5.0) {
    System.out.println("Base imponible = " + baseImponible);
    System.out.printf("IVA (" + IVAs.get(tipoIVA) * 100 + "%%) = %.2f\n", IVAPorBaseImponible);
    System.out.printf("Precio con IVA = " + "%.2f\n", IVAMasBaseImponible);
    System.out.println("Código promo (" + codigoDescuento + ") = " + (-5.0)); 
    System.out.printf("TOTAL = " + "%.2f\n", (IVAMasBaseImponible - 5.0));
  } else {
    System.out.println("Base imponible = " + baseImponible);
    System.out.printf("IVA (" + IVAs.get(tipoIVA) * 100 + "%%) = %.2f\n", IVAPorBaseImponible);
    System.out.printf("Precio con IVA = " + "%.2f\n",IVAMasBaseImponible);
    System.out.printf("Código promo (" + codigoDescuento + ") = %.2f\n", (IVAMasBaseImponibleYDescuento - IVAMasBaseImponible)); 
    System.out.printf("TOTAL = " + "%.2f\n", (IVAMasBaseImponibleYDescuento));
}
}
}
    
