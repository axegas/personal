import java.util.*;

public class Profesor {
	
	private String nombre;
	private int edad;
	private String DNI;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	public static int id= 0;
	public int idprof;
	
	public Profesor(String DNI,String nombre,int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
		id++;
		idprof = id;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Asignatura> getAsignaturas(){
		return asignaturas;
	}
	public int getEdad() {
		return edad;
	}

	public String getDNI() {
		return DNI;
	}

	public String toString() {
		return "- " + nombre + ", edad: " + edad + ", DNI: " + DNI + "\n";		
	}
	
	public String verProfesor() {
		String str = this.toString();
		str += "Asignaturas:\n";
		Iterator<Asignatura> iter = asignaturas.iterator();
		while(iter.hasNext()) {
			str += iter.next().toString();
		}
		return str;
	}
	
}
