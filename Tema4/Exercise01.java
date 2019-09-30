import java.util.HashMap;
public class Exercise01 {
	public static void main(String[] args) {
		      HashMap<String, String> diasDeLaSemana = new HashMap<String, String>();
		diasDeLaSemana.put("Lunes", "Programación");
		diasDeLaSemana.put("Martes", "Sistemas Informáticos");
		diasDeLaSemana.put("Miércoles", "Programación");
		diasDeLaSemana.put("Jueves", "Entornos de Desarrollo");
		diasDeLaSemana.put("Viernes", "Sistemas Informáticos");
		System.out.println("Input a day of the week (In Spanish, with tildes when needed, only in 'Miércoles'), so that the first subject for the day can be given");
		String dayChosen = System.console().readLine();
		System.out.println(diasDeLaSemana.get(dayChosen));
	}
}

	
