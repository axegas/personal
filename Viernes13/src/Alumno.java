import java.util.*;

public class Alumno {
	
	//atributos
	private String nombre;
	private String primape;
	private int edad;
	private String curso;
	private String DNI;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	
	//constructor
	public Alumno(String DNI,String nombre,String primape,int edad,String curso) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.primape = primape;
		this.edad = edad;
		this.curso = curso;
	}
	
	//geters
	public String getNombre() {
		return nombre;
	}

	public String getPrimape() {
		return primape;
	}
	public int getEdad() {
		return edad;
	}
	public String getCurso() {
		return curso;
	}
	public String getDNI() {
		return DNI;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrimape(String primape) {
		this.primape = primape;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	//toString
	public String toString() {
		String str = "";
		Iterator iter = asignaturas.iterator();
		while(iter.hasNext()) {
			str += iter.next().toString() + "\n";
		}
		return "Alumno [nombre=" + nombre + ", apellido=" + primape + ", edad=" + edad + ", curso=" + curso + ", DNI="
				+ DNI + "]\n" + str;
	}
	//mostrar
	public void mostrar() {
		String str = "";
		Iterator iter = asignaturas.iterator();
		while(iter.hasNext()) {
			str += iter.next().toString() + "\n";
		}
		System.out.println("Alumno [nombre=" + nombre + ", apellido=" + primape + ", edad=" + edad + ", curso=" + curso + ", DNI="
				+ DNI + "]\n" + str);
	}
	//metodos
	public void matricular(Asignatura as) {
		asignaturas.add(as);
		System.out.println("El alumno "+ nombre+" se ha matriculado en:");
		System.out.println(as.toString());
	}
	

}
