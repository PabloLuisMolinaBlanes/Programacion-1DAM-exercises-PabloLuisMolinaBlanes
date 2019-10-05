public class Exercise28 {
  public static void main(String[] args) {
    String eleccionJugador1;
    String eleccionJugador2;
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    eleccionJugador1 = System.console().readLine();
    System.out.println("");
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    eleccionJugador2 = System.console().readLine();
    if (eleccionJugador1.equalsIgnoreCase("piedra")) {
      switch (eleccionJugador2) {
        case "piedra":
        System.out.println("Empate");
        break;
        case "papel":
        System.out.println("Gana el jugador 2");
        break;
        case "tijera":
        System.out.println("Gana el jugador 1");
        break;
        default:
        System.out.println("Opción inválida del jugador 2");
        break;
      }
    }
    else if (eleccionJugador1.equalsIgnoreCase("papel")) {
      switch (eleccionJugador2) {
        case "piedra":
        System.out.println("Gana el jugador 1");
        break;
        case "papel":
        System.out.println("Empate");
        break;
        case "tijera":
        System.out.println("Gana el jugador 2");
        break;
        default:
        System.out.println("Opción inválida del jugador 2");
        break;
      }
    }
    else if (eleccionJugador1.equalsIgnoreCase("tijera")) {
      switch (eleccionJugador2) {
        case "piedra":
        System.out.println("Gana el jugador 2");
        break;
        case "papel":
        System.out.println("Gana el jugador 1");
        break;
        case "tijera":
        System.out.println("Empate");
        break;
        default:
        System.out.println("Opción inválida del jugador 2");
        break;
      }
    }
    else {
      System.out.println("Opción inválida del jugador 1/2");
    }
  }
}
