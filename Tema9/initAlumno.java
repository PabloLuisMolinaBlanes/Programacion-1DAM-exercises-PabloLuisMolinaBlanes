package Tema9;

public class initAlumno {

	public static void main(String[] args) {
		final int N = 10;
		Alumno[] alumnos = new Alumno[N];
		alumnos = Alumno.setNombre(alumnos, N);
		alumnos = Alumno.setNota(alumnos, N);
	}

}
