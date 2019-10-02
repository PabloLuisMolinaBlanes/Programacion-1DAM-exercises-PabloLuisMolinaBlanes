import java.util.HashMap;
public class Exercise01 {
	public static void main(String[] args) {
		HashMap<String, String> diasDeLaSemana = new HashMap<String, String>();
		diasDeLaSemana.put("lunes", "Programación");
		diasDeLaSemana.put("martes", "Sistemas Informáticos");
		diasDeLaSemana.put("miércoles", "Programación");
		diasDeLaSemana.put("jueves", "Entornos de Desarrollo");
		diasDeLaSemana.put("viernes", "Sistemas Informáticos");
		System.out.println("Input a day of the week (In Spanish), so that the first subject for the day can be given");
		String dayChosen = System.console().readLine().toLowerCase();
		if (dayChosen.equals("miercoles")) {
			dayChosen = "miércoles";
		}
		System.out.println(diasDeLaSemana.get(dayChosen));

		/* 
		  String dia = (System.console().readLine());
		  switch(dia) {
		  case = "lunes"
		  case = "miércoles":
		  case = "jueves":
		  System.out.println("PRO");
		  break;
		  case = "martes":
		  System.out.println("EDD");
		  break;
		  case = "viernes":
		  System.out.println("SINF");
		  break;
		  }
		 */
	}
}

	
