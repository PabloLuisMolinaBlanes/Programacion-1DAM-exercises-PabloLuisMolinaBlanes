import java.util.*;
public class Exercise21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota del primer control: ");
    double notaPrimerControl = sc.nextDouble();
    System.out.println("");
    System.out.print("Nota del segundo control: ");
    double notaSegundoControl = sc.nextDouble();
    System.out.println("");
    double mediaDeNotas = (notaPrimerControl + notaSegundoControl)/2;
    if (mediaDeNotas < 5 && !(mediaDeNotas < 0)) {
     String resultadoRecuperacion = new String(); 
     System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
     resultadoRecuperacion = System.console().readLine();
     System.out.println("");
     switch (resultadoRecuperacion) {
       case "apto":
       System.out.println("Tu nota de Programación es 5");
       break;
       default:
       System.out.println("Tu nota de Programación es " + mediaDeNotas);
       break;
     }
     } else if (mediaDeNotas >= 5 && !(mediaDeNotas > 10)) {
    System.out.println("Tu nota de Programación es " + mediaDeNotas);
}
      else {
      System.out.println("Esa media no existe en España");
      }
}
}  
    
