package PacoPotter;

public class Alumno {

	private String DNI;
	private String nombre;
	private int edad;
	private static int alumnos=0;
	
	
	public Alumno(String DNI, String nombre, int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
		alumnos++;	
		
	}
	
	public int getAlumnos() {
		return alumnos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return DNI;
	}
	public int getEdad() {
		return edad;
	}
	public String verAlumno() {
		String str = "\t-Alumno de DNI: " + DNI + " y nombre: " + nombre + " tiene " + edad + " años.";
		
		return str;
	}
	
}
