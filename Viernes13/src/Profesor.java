

public class Profesor {
	
	private String nombre;
	private int edad;
	private String DNI;
	
	
	public Profesor(String DNI,String nombre,int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]\n";
	}
	
	
	
}
