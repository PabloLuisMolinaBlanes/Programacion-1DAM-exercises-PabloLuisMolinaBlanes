import java.util.*;
public class Exercise24 { // This program is focused on its maintanibility more than to its' performance, this is why it uses HashMaps.
  public static void main(String[] args) {
   HashMap<String, Integer> cargosEmpleadosYSueldo = new HashMap<String, Integer>();
   HashMap<Integer, String> cargosEmpleados = new HashMap<Integer, String>();
   cargosEmpleados.put(1, "Programador Junior");
   cargosEmpleados.put(2, "Programador Senior");
   cargosEmpleados.put(3, "Jefe de Proyecto");
   cargosEmpleadosYSueldo.put("Programador Junior", 950);
   cargosEmpleadosYSueldo.put("Programador Senior", 1200);
   cargosEmpleadosYSueldo.put("Programador Junior", 1600);
   System.out.println("Este programa está pensado para indicar el sueldo correspondiente a cada cargo");
   System.out.println("");
   System.out.println("1 - Programador Junior" );
   System.out.println("2 - Programador Senior" );
   System.out.println("3 - Jefe de Proyecto" );
   System.out.print("Introduzca el cargo del empleado (1 - 3): ");
   int cargoElegido = Integer.parseInt(System.console().readLine());
   System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
   double diasEjercidos = Double.parseDouble(System.console().readLine());
   System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
   double sueldoBruto = cargosEmpleadosYSueldo.get(cargosEmpleados.get(cargoElegido)) + diasEjercidos * 30;
   System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
   int estadoCivil = Integer.parseInt(System.console().readLine());
   double sueldoNeto;
   if (estadoCivil == 2) {
     sueldoNeto = (double) sueldoBruto - sueldoBruto * 0.2;
  } else {
     sueldoNeto = (double) sueldoBruto - sueldoBruto * 0.25; 
 }
System.out.printf("Sueldo base %.2f\n", (sueldoBruto - (diasEjercidos*30)));
System.out.printf("Dietas (%.0f viajes) %.2f\n", diasEjercidos, 30 * diasEjercidos);
System.out.printf("Sueldo bruto %.2f\n", sueldoBruto);
if (estadoCivil == 2) {
System.out.printf("Retención IRPF (20%%) %.2f\n", sueldoBruto * 0.2);
}
else {
System.out.printf("Retención IRPF (25%%) %.2f\n", sueldoBruto * 0.25);  
}
System.out.printf("Sueldo neto %.2f\n", sueldoNeto);
}
}
