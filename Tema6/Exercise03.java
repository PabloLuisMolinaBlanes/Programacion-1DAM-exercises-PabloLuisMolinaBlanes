import java.util.HashMap;
public class Exercise03 {
	public static void main(String[] args) {
		HashMap<Integer, String> palosMayoresA7 = new HashMap<Integer,String>();
		palosMayoresA7.put(8, "sota");
		palosMayoresA7.put(9, "caballo");
		palosMayoresA7.put(10, "rey");
		palosMayoresA7.put(11, "as");
		int paloAleatorio = (int)(Math.random()*4+1);
		int cartaAleatoria= (int)(Math.random()*10+1);
		boolean esMiCartaMasDe7 = false;
		String cartaAleatoriaToString = "";
		if (cartaAleatoria > 7) {
			cartaAleatoriaToString = palosMayoresA7.get(cartaAleatoria);
			esMiCartaMasDe7 = true;
		}
		if (esMiCartaMasDe7) {
		switch (paloAleatorio) {
		case 1:
			System.out.println(cartaAleatoriaToString + " de picas");
			break;
		case 2:
			System.out.println(cartaAleatoriaToString + " de corazones");
			break;
		case 3:
			System.out.println(cartaAleatoriaToString + " de diamantes");
			break;
		case 4:
			System.out.println(cartaAleatoriaToString + " de tréboles");
			break;
		} } else {
			switch (paloAleatorio) {
			case 1:
				System.out.println(cartaAleatoria + " de picas");
				break;
			case 2:
				System.out.println(cartaAleatoria + " de corazones");
				break;
			case 3:
				System.out.println(cartaAleatoria + " de diamantes");
				break;
			case 4:
				System.out.println(cartaAleatoria + " de tréboles");
				break;
		}
	}
}
}



