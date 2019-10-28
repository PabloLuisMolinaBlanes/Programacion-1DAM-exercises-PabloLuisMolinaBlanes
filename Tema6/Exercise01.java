
public class Exercise01 {
	public static void main(String[] args) {
		int dadoPrimero = (int) (Math.random()*6+1);
		int dadoSegundo = (int) (Math.random()*6+1);
		int dadoTercero = (int) (Math.random()*6+1);
		System.out.println("El valor del primer dado es " + dadoPrimero);
		System.out.println("El valor del segundo dado es " + dadoSegundo);
		System.out.println("El valor del tercer dado es " + dadoTercero);
		System.out.println("Su suma es " + (dadoPrimero+dadoSegundo+dadoTercero));
	}
}
