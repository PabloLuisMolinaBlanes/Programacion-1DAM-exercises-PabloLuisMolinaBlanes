public class Exercise26 {
  public static void main(String[] args) {
    String diaDeLaSemana;
    String tieneTarjetaCine;
    int numeroDeEntradas;
    double precioPorEntrada = 0.00;
    double descuento = 0.00;
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Número de entradas: ");
    numeroDeEntradas = Integer.parseInt(System.console().readLine());
    System.out.print("Día de la semana: ");
    diaDeLaSemana = System.console().readLine();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    tieneTarjetaCine = System.console().readLine();
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    if (diaDeLaSemana.equalsIgnoreCase("jueves")) {
    System.out.println("Entradas dobles: " + numeroDeEntradas/2);  
    System.out.println("Entradas individuales: " + numeroDeEntradas % 2);
    } else {
    System.out.println("Entradas individuales: " + numeroDeEntradas); 
    }
    if (diaDeLaSemana.equalsIgnoreCase("miercoles")) {
      System.out.println("Precio por entrada individual: 5,00 €");
      precioPorEntrada = 5.00;
    } else if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 == 0)) {
      System.out.println("Precio por entrada individual: 8,00 €");
    } else {
      System.out.println("Precio por entrada de pareja: 11,00 €");
      System.out.println("Precio por entrada individual: 8,00 €"); 
      precioPorEntrada = 8.00; 
  }
  if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 == 0)) {
      System.out.printf("Total: %.2f €\n", (11 * (numeroDeEntradas/2)));
      } if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 != 0)) {
      System.out.printf("Total: %.2f €\n", (11 * (int) (numeroDeEntradas - (numeroDeEntradas % 2))/2) + (precioPorEntrada * (numeroDeEntradas % 2)));
    } else {
      System.out.printf("Total: %.2f €\n", (precioPorEntrada * numeroDeEntradas)); 
  }
    if (tieneTarjetaCine.equalsIgnoreCase("s")) {
      if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 != 0)) {
       System.out.printf("Descuento: %.2f €\n", (11 * (numeroDeEntradas/2)) * 0.1);
       descuento = (11 * (numeroDeEntradas/2)) * 0.1;
    } else if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 != 0)) {
      System.out.printf("Descuento: %.2f €\n", 11 * (int) (numeroDeEntradas - (numeroDeEntradas % 2))/2 + (precioPorEntrada * (numeroDeEntradas % 2)) * 0.1);
      descuento = (11 * (int) (numeroDeEntradas - (numeroDeEntradas % 2))/2 + (precioPorEntrada * (numeroDeEntradas % 2)) * 0.1);
    } else {
      System.out.printf("Descuento: %.2f €\n", numeroDeEntradas * precioPorEntrada * 0.1);
      descuento = numeroDeEntradas * precioPorEntrada * 0.1;
  }
  } else {
      System.out.println("Descuento: 0,00 €");
      descuento = 0.00;      
     } if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 == 0)) {
      System.out.printf("Total: %.2f €\n", (11 * (numeroDeEntradas/2) - descuento));
      } if (diaDeLaSemana.equalsIgnoreCase("jueves") && (numeroDeEntradas % 2 != 0)) {
      System.out.printf("Total: %.2f €\n", ( -descuento + 11 * (int) (numeroDeEntradas - (numeroDeEntradas % 2))/2) + (precioPorEntrada * (numeroDeEntradas % 2)));
    } else {
      System.out.printf("Total: %.2f €\n", (-descuento + precioPorEntrada * numeroDeEntradas)); 
  }
}
}



    
    
