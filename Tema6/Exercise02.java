import java.util.HashMap;
public class Exercise02 {
	public static void main(String[] args) {
		HashMap<Integer, String> palosMayoresA10 = new HashMap<Integer,String>();
		palosMayoresA10.put(11, "J");
		palosMayoresA10.put(12, "Q");
		palosMayoresA10.put(13, "K");
		palosMayoresA10.put(14, "A");
		int paloAleatorio = (int)(Math.random()*4+1);
		int cartaAleatoria= (int)(Math.random()*14+1);
		boolean esMiCartaMasDe10 = false;
		String cartaAleatoriaToString = "";
		if (cartaAleatoria > 10) {
			cartaAleatoriaToString = palosMayoresA10.get(cartaAleatoria);
			esMiCartaMasDe10 = true;
		}
		if (esMiCartaMasDe10) {
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



