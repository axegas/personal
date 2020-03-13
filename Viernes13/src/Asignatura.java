
public class Asignatura {
	//atributos
	private String nombre;
	private int duracion;
	private String libro;
	private String profesor;
	private String obligatoria = "NO";
	
	//constructor
	public Asignatura(String nombre, int duracion, String libro, String profesor) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.libro = libro;
		this.profesor = profesor;
		if(nombre.equals("Programacion")) {
			obligatoria = "SÍ";
		}		
	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public String getLibro() {
		return libro;
	}
	public String getProfesor() {
		return profesor;
	}
	public String getObligatoria() {
		return obligatoria;
	}
	//toString
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", duracion=" + duracion + ", libro=" + libro + ", profesor=" + profesor
				+ ", obligatoria=" + obligatoria + "]";
	}
	//mostrar
	public void mostrar() {
		System.out.println("Asignatura [nombre=" + nombre + ", duracion=" + duracion + ", libro=" + libro + ", profesor=" + profesor
				+ ", obligatoria=" + obligatoria + "]");
	}
	
	
	
}
