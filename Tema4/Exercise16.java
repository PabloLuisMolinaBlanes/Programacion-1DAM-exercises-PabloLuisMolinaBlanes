import java.util.Scanner;
public class Exercise16 {
  public static void main(String[] args) {
    int puntuacion = 0;
    Scanner respuesta = new Scanner(System.in);
    String respuestaActual;
    System.out.println("¿Es tu pareja infiel? Haga este cuestionario para quedarse más tranquilo");
    System.out.println("Responda con 'verdadero' o 'falso'");
    System.out.println("");
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Ha aumentado sus gastos de vestuario");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Has notado que últimamente se perfuma más");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuestaActual = respuesta.nextLine();
    if (respuestaActual.equalsIgnoreCase("verdadero")) {
      puntuacion += 3;
    }
    System.out.println("");
    if (puntuacion < 10 && puntuacion >= 0) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    if (puntuacion > 11 && puntuacion < 22) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    if (puntuacion >= 22 && puntuacion <= 30) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
