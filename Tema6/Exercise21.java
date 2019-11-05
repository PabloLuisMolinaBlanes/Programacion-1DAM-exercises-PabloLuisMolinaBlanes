import java.util.HashMap;
public class Exercise21 {
	public static void main(String[] args) {
		HashMap<Integer,String> caraCruz = new HashMap<Integer,String>();
		caraCruz.put(1, "cara");
		caraCruz.put(2, "cruz");
		int dosCents = (int) (((Math.random()*2)+1));
		int veinteCents = (int) (((Math.random()*2)+1));
		int cincuentaCents = (int) (((Math.random()*2)+1));
		int unEuro = (int) (((Math.random()*2)+1));
		int dosEuro = (int) (((Math.random()*2)+1));
		System.out.println("2 céntimos - " + caraCruz.get(dosCents));
		System.out.println("20 céntimos - " + caraCruz.get(veinteCents));
		System.out.println("50 céntimos - " + caraCruz.get(cincuentaCents));
		System.out.println("1 euro - " + caraCruz.get(unEuro));
		System.out.println("2 euros - " + caraCruz.get(dosEuro));
	}
}
