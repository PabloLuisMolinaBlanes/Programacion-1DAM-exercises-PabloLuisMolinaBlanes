
public class Exercise13 {
	public static void main(String[] args) {
		int dadoPrimero = (int) (Math.random()*6+1);
		int dadoSegundo = (int) (Math.random()*6+1);
		while (dadoPrimero != dadoSegundo) {
			System.out.print(dadoPrimero + " " + dadoSegundo);
			dadoPrimero = (int) (Math.random()*6+1);
			dadoSegundo = (int) (Math.random()*6+1);
			System.out.println("");
			System.out.print(dadoPrimero + " " + dadoSegundo);
			System.out.println("");
		  }
		}
	  }
