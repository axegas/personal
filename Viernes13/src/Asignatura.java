import javax.swing.JOptionPane;

public class Asignatura {
	//atributos
	private String nombre;
	private int duracion;
	private String libro;
	private Profesor profesor;
	private String obligatoria = "NO";
	
	//constructor
	public Asignatura(String nombre, int duracion, String libro, Profesor profesor) {
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
		return profesor.getNombre();
	}
	public String getObligatoria() {
		return obligatoria;
	}
	//toString
	public String toString() {
		return "- " + nombre + ", duracion: " + duracion + ", libro: " + libro + ", profesor: " + profesor.getNombre()
				+ ", obligatoria: " + obligatoria + "\n";
	}
	//mostrar
	public void mostrar() {
		JOptionPane.showMessageDialog(null, this.toString()); 	
	}
	
	
	
}
